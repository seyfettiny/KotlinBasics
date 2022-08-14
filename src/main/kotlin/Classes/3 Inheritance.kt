package Classes

//  classes can not be extended without open keyword, because classes are final in nature
open class Shape(val name:String) {
    var color: String = "Black"
    open var edgeCount: Int = 0

    constructor(name:String,color: String):this(name) {
        this.color = color
    }

    constructor(name: String, color: String, edgeCount: Int) : this(name) {
        this.color = color
        this.edgeCount = edgeCount
    }

    open fun draw() {
        println("Name: $name")
        println("Edge: $edgeCount")
        println("Color: $color")
    }
}
class Rectangle(name: String):Shape(name) {
    override var edgeCount: Int = 4

    //  This is called polymorphism
    //  A function that defined in a super class, have different implementation in subclass
    //  If we point the overridden function with super keyword, it will call the super class implementation,
    //  then does rest of the function body.
    override fun draw() {
        super.draw()
        val rectangle =
            """
            |   *********
            |   *       *
            |   *       *
            |   *       *
            |   *       *
            |   *       *
            |   *********
                        """.trimIndent()
        println("$rectangle \n")
    }
}
class Triangle(name: String):Shape(name) {
    override var edgeCount: Int = 3

    override fun draw() {
        super.draw()
        val triangle =
            """
                /\\
                /  \\
                /    \\
                /      \\
                /        \\
                /          \\
                /            \\
                /              \\
                /________________\\
                        """.trimIndent()
        println("$triangle \n")
    }
}
class Circle(name: String,color: String):Shape(name,color) {
    override var edgeCount: Int = 1

    override fun draw() {
        super.draw()
        val circle =
               """
                          , - ~ ~ ~ - ,
                      , '               ' ,
                    ,                       ,
                   ,                         ,
                  ,                           ,
                  ,                           ,
                  ,                           ,
                   ,                         ,
                    ,                       ,
                      ,                 , '
                        ' - , _ _ _ , '
                        """.trimIndent()
        println("$circle \n")
    }
}

fun main() {
    val shape = Shape("Shape")
    val rectangle = Rectangle("Rectangle")
    val triangle = Triangle("Triangle")
    val circle = Circle("Circle","Yellow")

    shape.draw()
    rectangle.draw()
    triangle.draw()
    circle.draw()
}