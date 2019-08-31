package business

class contactBusiness {

    fun validate (name: String, phone: String) {
        if (name == "") {
            throw Exception("nome é obrigatório")
        }
        if (phone == "") {
            throw Exception("telefone é obrigatório")
        }
    }

    fun validateDelete (name: String, phone: String) {
        if (name == "" || phone == "") {
            throw Exception("Selecione um contato para remover")
        }
    }

    fun save (name: String, phone: String) {
        validate(name, phone)
    }

    fun delete(name: String, phone: String) {
        validateDelete(name, phone)
    }
}