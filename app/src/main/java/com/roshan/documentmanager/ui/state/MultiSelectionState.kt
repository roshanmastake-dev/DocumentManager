package com.roshan.documentmanager.ui.state

data class MultiSelectionState(

    val enabled: Boolean = false,

    val selectedItems: Set<Long> = emptySet()

) {

    val count: Int

        get() = selectedItems.size

}
