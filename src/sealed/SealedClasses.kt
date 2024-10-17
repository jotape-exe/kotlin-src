package sealed

sealed class ApiResponse {
    data class Success(val data: String) : ApiResponse()
    data class Error(val message: String) : ApiResponse()
    object Loading : ApiResponse()
}

fun handleResponse(response: ApiResponse) {
    when (response) {
        is ApiResponse.Success -> println("Dados recebidos: ${response.data}")
        is ApiResponse.Error -> println("Erro: ${response.message}")
        ApiResponse.Loading -> println("Carregando...")
    }
}

fun main(){
    handleResponse(ApiResponse.Success("{ status: 200, body: [] }"))
}