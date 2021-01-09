package com.sinngjpeg.gitpop.viewModel


import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sinngjpeg.github.webservices.RetrofitService
import com.sinngjpeg.gitpop.model.data.ItemRepository
import com.sinngjpeg.gitpop.model.data.Repository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RepositoryViewModel : ViewModel() {

    private val repositoryClient by lazy { RetrofitService.service }
    val repositoryLiveData: MutableLiveData<List<Repository>> = MutableLiveData()

    fun getRepositories(page: Int) {
        repositoryClient.getRepositories(page).enqueue(
            object : Callback<ItemRepository> {
                override fun onResponse(
                    call: Call<ItemRepository>,
                    response: Response<ItemRepository>
                ) {
                    if (response.isSuccessful) {
                        response.body()?.let { itemRepository ->
                            repositoryLiveData.value = itemRepository.items
                        }
                    }
                }

                override fun onFailure(call: Call<ItemRepository>, t: Throwable) {
                    Log.d("Erro de Chamada", t.message.toString())
                }
            })
    }
}


