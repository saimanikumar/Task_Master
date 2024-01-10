package com.example.todo


object DataObject {
    var listdata = mutableListOf<CardInfo>()

    fun setData(title: String,  description:String, priority: String, date: String, category: String) {
        listdata.add(CardInfo(title,description,priority, date, category))
    }

    fun getAllData(): List<CardInfo> {
        return listdata
    }

    fun deleteAll(){
        listdata.clear()
    }

    fun getData(pos:Int): CardInfo {
        return listdata[pos]
    }

    fun deleteData(pos:Int){
        listdata.removeAt(pos)
    }

    fun updateData(pos:Int,title:String,description:String, priority: String, date: String, category: String)
    {
        listdata[pos].title=title
        listdata[pos].description=description
        listdata[pos].priority=priority
        listdata[pos].date=date
        listdata[pos].category=category

    }

}