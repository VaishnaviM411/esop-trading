package com.esop.dto

import com.esop.constant.MAX_INVENTORY_CAPACITY
import com.esop.constant.MAX_WALLET_CAPACITY
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import io.micronaut.core.annotation.Introspected
import javax.validation.constraints.*


@Introspected
class CreateOrderDTO @JsonCreator constructor(

    @field:NotBlank(message = "Order Type can not be missing or empty.")
    @field:Pattern(regexp = "^((?i)BUY|(?i)SELL)$", message = "Invalid Type: should be one of BUY or SELL")
    var type: String? = null,

    @field:NotNull(message = "Quantity can not be missing.")
    @field:Min(1, message = "Quantity has to be greater than zero")
    @field:Max(MAX_INVENTORY_CAPACITY, message = "quantity can't exceed maximum inventory capacity of ${MAX_INVENTORY_CAPACITY.toString()}")
    var quantity: Long? = null,

    @JsonProperty("price")
    @field:NotNull(message = "Price can not be missing.")
    @field:Min(1, message = "Price can not be less than zero")
    @field:Digits(integer = 9, fraction = 0, message = "amount can't exceed maximum wallet capacity of ${MAX_WALLET_CAPACITY.toString()}")
    var price: Long? = null,

    @JsonProperty("inventoryType")
    @field:Pattern(regexp = "^((?i)NON_PERFORMANCE|(?i)PERFORMANCE)$", message = "inventoryType should be one of NON_PERFORMANCE or PERFORMANCE")
    var inventoryType: String? = "NON_PERFORMANCE"
)
