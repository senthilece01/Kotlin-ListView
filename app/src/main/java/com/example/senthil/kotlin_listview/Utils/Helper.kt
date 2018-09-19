package com.example.senthil.kotlin_listview.Utils

import com.example.senthil.kotlin_listview.Model.ListViewModel

class Helper{
    companion object {
        fun <ArrayList> getListViewModelList(): ArrayList {
            var listViewModelArrayList = ArrayList<ListViewModel>()
            listViewModelArrayList.add(ListViewModel(1, "Afghanistan", "+93"))
            listViewModelArrayList.add(ListViewModel(2, "Australia", "+61"))
            listViewModelArrayList.add(ListViewModel(3, "Bangladesh", "+880"))
            listViewModelArrayList.add(ListViewModel(4, "Canada", "+1"))
            listViewModelArrayList.add(ListViewModel(5, "China", "+86"))
            listViewModelArrayList.add(ListViewModel(6, "Germany", "+49"))
            listViewModelArrayList.add(ListViewModel(7, "India", "+91"))
            listViewModelArrayList.add(ListViewModel(8, "Japan", "+81"))
            listViewModelArrayList.add(ListViewModel(9, "Malaysia", "+60"))
            listViewModelArrayList.add(ListViewModel(10, "Mexico", "+52"))
            return listViewModelArrayList as ArrayList
        }
    }
}