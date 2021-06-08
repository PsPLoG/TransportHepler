package com.psplog.transporthelpersample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.psplog.transporthelpersample.databinding.ItemBusBinding
import kr.co.supermove.transporthelper.BusUtils
import kr.co.supermove.transporthelper.ViewDrawableExtention.tintImage
import kr.co.supermove.transporthelper.ViewDrawableExtention.tintSolid
import kr.co.supermove.transporthelper.ViewDrawableExtention.tintStroke

class TransportAdapter : RecyclerView.Adapter<TransportAdapter.Holder>() {
    var items: List<TransportBusItem> = listOf()

    class Holder(private val binding: ItemBusBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(transportBusItem: TransportBusItem) {
            binding.transportName.text = transportBusItem.transportName
            BusUtils.getBusColor(binding.root.context, transportBusItem.transportType).let {
                binding.transportIcon.tintImage(it)
                binding.transportName.setTextColor(it)
                when (transportBusItem.transportBackgroundType) {
                    TransportBusItem.SOLID_BACKGROUND -> {
                        binding.transportType.tintSolid(it)
                        binding.transportType.tintStroke(it)
                    }
                    TransportBusItem.STROKE_BACKGROUND -> {
                        binding.transportType.setTextColor(it)
                        binding.transportType.tintStroke(it)
                    }
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = ItemBusBinding.inflate(LayoutInflater.from(parent.context))
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size
}