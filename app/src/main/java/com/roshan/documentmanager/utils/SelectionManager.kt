package com.roshan.documentmanager.utils

class SelectionManager<T> {

    private val selectedItems = mutableSetOf<T>()

    fun toggle(item: T) {

        if (selectedItems.contains(item)) {

            selectedItems.remove(item)

        } else {

            selectedItems.add(item)

        }

    }

    fun clear() {

        selectedItems.clear()

    }

    fun isSelected(item: T): Boolean {

        return selectedItems.contains(item)

    }

    fun getSelected(): List<T> {

        return selectedItems.toList()

    }

    fun count(): Int {

        return selectedItems.size

    }

}
