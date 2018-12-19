package at.fh.swengb.collectionsandrecyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        val students = listOf<Student>(Student("Student1",3),Student("Student2",5),Student("Student3",3),Student("Student4",6),Student("Student5",30))
        val temp = students.get(2).name
        Log.i("Students","Student mit Index 2: $temp")
        println("Student mit Index 2: $temp")

        val studentsMutable = mutableListOf<Student>(Student("Student1",3),Student("Student2",5),Student("Student3",3),Student("Student4",6),Student("Student5",30))
        val tempStudent = Student("DerNeue",9)
        studentsMutable[3] = tempStudent //(3,tempStudent)
        val temp2 = studentsMutable[3].name
        println("Student mit Index 3: $temp2")
        val tempStudent2 = Student("DerLetzte",9)
        studentsMutable.add(tempStudent2)

        for(i in 0..(studentsMutable.size - 1)){
            println("Studenten der Liste: " + studentsMutable[i].name)
        }

        val studentSet = setOf<Student>(Student("Harry",1),Student("Harry",1),Student("Mona-Lisa",5),Student("Der Dude",45),Student("Mona-Lisa",5))

        for(stud in studentSet){
            println("Studenten der Liste: " + stud.name)
        }

        val studentMutableSet = mutableSetOf<Student>(Student("Rob",1),Student("Harry",1),Student("Mona-Lisa",5),Student("Der Dude",45),Student("Gabi",5))
        studentMutableSet.add(Student("Rob",1))
        studentMutableSet.add(Student("Barry",17))

        for(stud in studentMutableSet){
            println("Studenten der Liste: " + stud.name)
        }

        for(stud in studentMutableSet){
            if (stud.name == "Rob"){
                println("Studenten der Liste: " + stud.name)
            }
        }
        */

        val ima18List = listOf(Student("Tyrion", 1), Student("Jon", 1))
        val ima17List = mutableListOf(Student("Sansa", 3), Student("Arya", 3), Student("Bran", 3))
        val studentMap = mapOf<String, List<Student>>("IMA18" to ima18List, "IMA17" to ima17List)

        for ((key, value) in studentMap){
            for(stud in value){
                println("Studenten: " + stud.name + " ist im " + stud.currentSemester + "ten Semester.")
            }
        }
    }
}
