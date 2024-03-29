package com.rus_artur4ik.workouter.common

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController

abstract class CoreScreen<S : CoreState, VM : CoreViewModel<S>>(
    private val viewModelClass: Class<VM>
) {

    @Composable
    fun Content(navHostController: NavHostController? = null) {
        val viewModel = viewModel(modelClass = viewModelClass)

        Content(viewModel = viewModel, navHostController = navHostController)
    }

    @Composable
    protected abstract fun Content(viewModel: VM, navHostController: NavHostController?)

}