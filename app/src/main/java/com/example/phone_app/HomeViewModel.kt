package com.example.phone_app



import com.example.phone_app.Data.Products
import com.example.phone_app.UI.Adapters.HomeController
import timber.log.Timber
import java.math.BigDecimal
import java.math.MathContext

var addcart : MutableList<Products> = ArrayList()
class HomeViewModel(private val homeController: HomeController) : ScopedViewModel() {
    // TODO: Implement the ViewModel

    var products = homeController.downloadProduct
    fun addProduct(list: Products) {
        addcart.add(list)

    }
    fun RemoveProduct(id: Int) {
        addcart.removeAt(id)


    }
    fun GetPrice():BigDecimal{
        return  addcart.sumByDouble { it.price}.toBigDecimal()
    }
    fun  getProduct(): MutableList<Products> {
        return addcart

    }
    fun getUsers(){
        launchWithLoad({
            homeController.getUsers()

        }){}
    }



    }










