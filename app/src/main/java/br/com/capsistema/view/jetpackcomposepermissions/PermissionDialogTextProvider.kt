package br.com.capsistema.view.jetpackcomposepermissions
interface PermissionDialogTextProvider {
    fun getTitle() : String
    fun getDescription(isPermanentlyDeclined: Boolean): String
    fun getButtonLabel(isPermanentlyDeclined: Boolean): String
}