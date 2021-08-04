package kr.co.supermove.transporthelper

import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.GradientDrawable
import android.view.View
import android.widget.ImageView

object ViewDrawableExtention {
    fun View.tintStroke(color: Int) {
        this.resources.displayMetrics.density.let {

        }
        this.background?.constantState?.let {
            val origin = (it.newDrawable().mutate()) as? GradientDrawable
            origin?.setStroke(4, color)
            this.background = origin
        }
    }

    fun View.tintStroke(color: Int, widthDp: Double) {
        this.resources.displayMetrics.density.let { scale ->
            this.background?.constantState?.let {
                val origin = (it.newDrawable().mutate()) as? GradientDrawable
                origin?.setStroke((widthDp * scale).toInt(), color)
                this.background = origin
            }
        }

    }

    fun View.tintSolid(color: Int) {
        this.background?.let {
            when (it) {
                is GradientDrawable -> {
                    val origin = (it.mutate()) as GradientDrawable
                    origin.setColor(color)
                    this.background = origin
                }
                is ColorDrawable -> {
                    val origin = (it.mutate()) as ColorDrawable
                    origin.color = color
                    this.background = origin
                }
            }
        }
    }

    fun ImageView.tintImage(color: Int) {
        this.drawable.mutate().setTint(color)
    }

}