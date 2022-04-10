package test.map.goldddak.myobject

class MyObject {
    companion object{
        val myObject = MyObject()
    }

    //Tire를 Int형에서 query의 String 형태로 return
    fun TireInt(tire:Int):String{
        when(tire){
            1 -> return "I"
            2 -> return "II"
            3 -> return "III"
            4 -> return "IV"
        }

        return "ERROR"

    }

}