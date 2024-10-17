package sealed

sealed interface UserRole {
    fun permissions(): String
}

data class Admin(val name: String) : UserRole {
    override fun permissions(): String = "Full access"
}

data class Editor(val name: String) : UserRole {
    override fun permissions(): String = "Edit content"
}

object Viewer : UserRole {
    override fun permissions(): String = "View only"
}

fun checkPermissions(role: UserRole) {
    when (role) {
        is Admin -> println("Admin ${role.name} tem permissões: ${role.permissions()}")
        is Editor -> println("Editor ${role.name} tem permissões: ${role.permissions()}")
        Viewer -> println("Viewer tem permissões: ${Viewer.permissions()}")
    }
}

fun main(){
    val admin = Admin("José Silva")

    checkPermissions(admin)
}
