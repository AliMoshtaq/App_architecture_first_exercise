package com.example.apparchitecturefirstexercise.models

data class CovidData(
    val errors: List<Any>,
    val get: String,
    val parameters: Parameter,
    val response: List<Response>,
    val results: Int
)