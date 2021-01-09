package com.sinngjpeg.gitpop.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sinngjpeg.gitpop.databinding.ItemRepositoryBinding
import com.sinngjpeg.gitpop.model.data.ItemRepository
import com.sinngjpeg.gitpop.model.data.Repository

class RepositoryAdapter(
    val repository: List<Repository>
) : RecyclerView.Adapter<RepositoryAdapter.RepositoryViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): RepositoryViewHolder {
        return RepositoryViewHolder(
            ItemRepositoryBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(viewHolder: RepositoryViewHolder, position: Int) {
        viewHolder.bindingView(repository[position])
    }

    override fun getItemCount(): Int {
        return repository.size
    }


    class RepositoryViewHolder(
        val itemRepositoryBinding: ItemRepositoryBinding
    ) : RecyclerView.ViewHolder(itemRepositoryBinding.root) {

        fun bindingView(repository: Repository) {
            itemRepositoryBinding.titleRepository.text = repository.title
            itemRepositoryBinding.descriptionRepository.text = repository.description
            itemRepositoryBinding.qntStarsRepository.text = repository.qntStars.toString()
            itemRepositoryBinding.qntForksRepository.text = repository.qntForks.toString()
//            itemRepositoryBinding.usernameRepository.text = repository.owner.userName
//
//            Glide.with(itemRepositoryBinding.userPhoto)
//                .load(repository.owner.userPhoto)
//                .circleCrop()
//                .into(itemRepositoryBinding.user_photo)
        }
    }
}
