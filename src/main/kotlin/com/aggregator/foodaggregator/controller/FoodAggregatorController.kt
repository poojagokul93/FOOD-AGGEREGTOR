package com.aggregator.foodaggregator.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMethod
import java.net.URL


@RestController
@RequestMapping("/AGGREGATOR")
class FoodAggregatorController {
    @RequestMapping("/buy_item/{name}", method = [(RequestMethod.GET)])
       fun getItemByName(@PathVariable("name") name : String)
            : Any =
            if (name == "Apple" || name == "banana") {
                ResponseEntity.ok(
                        getJsonFromURL( "https://run.mocky.io/v3/c51441de-5c1a-4dc2-a44e-aab4f619926b")
                )
            }
            else if(name == "Carrot" || name == "okra" || name == "Onion"){
                ResponseEntity.ok(
                        getJsonFromURL( " https://run.mocky.io/v3/4ec58fbc-e9e5-4ace-9ff0-4e893ef9663c")
                )
            }
            else if(name == "wheat" || name == "barley" || name == "rye"){

                ResponseEntity.ok(
                         getJsonFromURL ("https://run.mocky.io/v3/e6c77e5c-aec9-403f-821b-e14114220148").toString()
                )
            }
            else{
                ResponseEntity.badRequest().body("Item not found")
            }
    fun getJsonFromURL(wantedURL: String ): String {

        var result= URL(wantedURL).readText()
       // println(result)
        fetchDetails(result)
          return result
        }
    fun fetchDetails(array : Any){
        var resultArray= listOf(array)
        //println(resultArray)
        var listarry=resultArray.iterator()
        while(listarry.hasNext())
        {
            var item = listarry.next().toString()
        }
       }
    @RequestMapping("/buy_item_qty_price/{name}/{qnty}/{price}", method = [(RequestMethod.GET)])
    fun getItemByQntyPrice(@PathVariable("name") name: String,@PathVariable("qnty") qnty: Int,
                           @PathVariable("price") price: Double) {
                    ResponseEntity.ok()
            }


    }




