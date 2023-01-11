package com.vestibulario.presentation.home.model

sealed class LoginModulePresentation {
    object IsLoading : LoginModulePresentation()
    object IsLoggedIn : LoginModulePresentation()
    object IsNotLoggedIn : LoginModulePresentation()
}
