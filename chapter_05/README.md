# 🟣 Kotlin Classes & Objects Master Guide
## Ek Baar Samjho, Lifetime Yaad Rakho 🚀

---

# 📌 Introduction

Ye documentation Kotlin ke sabse important concepts me se ek:

# 🔥 Classes and Objects

ko deeply explain karta hai.

Agar tum Object Oriented Programming (OOP) samajh gaye,
toh tum:
- Android Apps bana sakte ho
- Games bana sakte ho
- Backend systems bana sakte ho
- Real-world scalable software develop kar sakte ho

Kotlin heavily OOP based language hai.

Isliye:
Classes aur Objects samajhna mandatory hai.

---

# 🧠 Real Meaning of Class and Object

Sabse pehle simple definition:

| Concept | Meaning |
|---|---|
| Class | Blueprint / Design |
| Object | Actual Real Thing |

---

# 🏠 Real Life Analogy (MOST IMPORTANT)

Imagine tum ek ghar bana rahe ho.

## Blueprint kya hota hai?

Architect pehle ek design banata hai.

Usme hota hai:
- rooms
- doors
- windows
- kitchen
- bathroom

But:

⚠ Blueprint actual ghar nahi hota.

Wo sirf:
> instruction hota hai ghar banane ka.

---

# 🟣 Class = Blueprint

Programming me:

```text
Class = Design Plan
```

---

# 🟢 Object = Actual House

Jab us blueprint ko use karke real ghar banta hai:

wo hota hai:

```text
Object
```

---

# 📌 Simple Understanding

| Real World | Programming |
|---|---|
| Blueprint | Class |
| House | Object |
| Car Design | Class |
| Actual Car | Object |
| Mobile Design | Class |
| Real Mobile | Object |

---

# 🔥 What is a Class in Kotlin?

Class ek template hota hai.

Ye define karta hai:
- data
- behavior
- properties
- functions

Example:

```kotlin
class Car {

}
```

Ye sirf ek blueprint hai.

Abhi koi real car exist nahi karti.

---

# 🔥 What is an Object?

Object class ka actual instance hota hai.

Example:

```kotlin
val myCar = Car()
```

Ab:
```kotlin
myCar
```

ek actual object hai.

---

# 🧠 Most Important Line

> Class blueprint hota hai.
> Object us blueprint ka real instance hota hai.

---

# 🟣 Basic Kotlin Class

```kotlin
class Student {

    var name = "Subh"

    fun study(){
        println("Studying...")
    }

}
```

---

# 📌 Breakdown

## Property

```kotlin
var name = "Subh"
```

Ye data store karta hai.

---

## Function

```kotlin
fun study()
```

Ye behavior define karta hai.

---

# 🔥 Creating Object

```kotlin
val student1 = Student()
```

Yaha:
```kotlin
student1
```

actual object hai.

---

# 🔥 Accessing Properties

```kotlin
println(student1.name)
```

Output:

```bash
Subh
```

---

# 🔥 Calling Functions

```kotlin
student1.study()
```

Output:

```bash
Studying...
```

---

# 🧠 Full Example

```kotlin
class Student {

    var name = "Subh"

    fun study(){
        println("$name is studying")
    }

}

fun main(){

    val student1 = Student()

    println(student1.name)

    student1.study()

}
```

Output:

```bash
Subh
Subh is studying
```

---

# 🔥 Constructors in Kotlin

Constructor object create hone ke time initialize karta hai.

---

# 🟣 Primary Constructor

```kotlin
class Student(val name: String)
```

---

# 🔥 Creating Object

```kotlin
val s1 = Student("Subh")
```

Now:

```kotlin
println(s1.name)
```

Output:

```bash
Subh
```

---

# 🧠 Constructor Real Meaning

Constructor:
> object create hone ke time values set karta hai.

---

# 🟣 Multiple Objects

Ek class se multiple objects ban sakte hain.

Example:

```kotlin
class Student(val name: String)

fun main(){

    val s1 = Student("Subh")
    val s2 = Student("Rahul")
    val s3 = Student("Aman")

    println(s1.name)
    println(s2.name)
    println(s3.name)

}
```

Output:

```bash
Subh
Rahul
Aman
```

---

# 🔥 Why OOP Important?

Real world bahut complex hota hai.

OOP complex cheezo ko:
- small objects
- manageable structures

me divide karta hai.

---

# 🧠 OOP = Object Oriented Programming

OOP ka goal:

> Real-world problems ko objects ke form me solve karna.

---

# 🔥 4 Pillars of OOP

Ye MOST IMPORTANT section hai.

---

# 1️⃣ Encapsulation

## Meaning

Related data aur functions ko ek class ke andar wrap karna.

Example:

```kotlin
class Mobile {

    var battery = 100

    fun call(){
        println("Calling...")
    }

}
```

Yaha:
- battery
- calling feature

same class ke andar hain.

---

# 📱 Real Life Example

Tum phone use karte ho.

But:
- wiring kaise hua
- motherboard kaise work karta
- internal hardware kaise connected

ye sab tumhe nahi pata.

Sab internally packed hai.

Isi ko bolte hain:

# 🔥 Encapsulation

---

# 2️⃣ Abstraction

## Meaning

Internal implementation ko hide karna.

Sirf important cheeze dikhana.

---

# 📱 Example

Photo lene ke liye:
- camera app open karo
- click button

Bas.

Tumhe ye nahi pata:
- lens kaise work karta
- image processing kaise hota
- sensor kaise kaam karta

Sab hidden hai.

Ye abstraction hai.

---

# 🔥 Real Programming Example

```kotlin
fun takePhoto(){
    println("Photo Captured")
}
```

User ko bas function use karna hai.

Internal logic hidden hai.

---

# 3️⃣ Inheritance

## Meaning

Ek class dusri class ki properties aur functions inherit kar sakti hai.

---

# 🟣 Parent Class

```kotlin
open class Animal {

    fun eat(){
        println("Eating...")
    }

}
```

---

# 🟢 Child Class

```kotlin
class Dog : Animal()
```

---

# 🔥 Using Inheritance

```kotlin
fun main(){

    val dog = Dog()

    dog.eat()

}
```

Output:

```bash
Eating...
```

---

# 🧠 Real Meaning

Dog class ne:
```kotlin
Animal
```

ki abilities inherit kari.

---

# 📌 IS-A Relationship

```text
Dog IS-A Animal
```

Ye inheritance relationship hai.

---

# 🔥 HAS-A Relationship

Example:

```text
Car HAS-A Engine
```

Ye composition relationship hai.

---

# 📌 Difference

| Relationship | Meaning |
|---|---|
| IS-A | Inheritance |
| HAS-A | Composition |

---

# 4️⃣ Polymorphism

## Meaning

Same interface,
different behavior.

---

# 🟣 Example

```kotlin
open class Animal {

    open fun sound(){
        println("Animal sound")
    }

}
```

---

# 🟢 Child Classes

```kotlin
class Dog : Animal(){

    override fun sound(){
        println("Bark")
    }

}

class Cat : Animal(){

    override fun sound(){
        println("Meow")
    }

}
```

---

# 🔥 Main Function

```kotlin
fun main(){

    val dog = Dog()
    val cat = Cat()

    dog.sound()
    cat.sound()

}
```

Output:

```bash
Bark
Meow
```

---

# 🧠 Polymorphism Meaning

Same function:
```kotlin
sound()
```

Different outputs de raha hai.

---

# 🔥 Overriding

Child class parent function ko modify kar sakti hai.

Use bolte hain:

# 🔥 Override

---

# 🟣 Example

```kotlin
override fun sound()
```

---

# 🔥 Visibility Modifiers

Ye decide karte hain:
> kaun access kar sakta hai.

---

# 📌 Types

| Modifier | Meaning |
|---|---|
| public | sab access kar sakte |
| private | sirf class ke andar |
| protected | class + subclasses |
| internal | same module |

---

# 🟣 Example

```kotlin
class Bank {

    private var balance = 1000

}
```

Yaha:
```kotlin
balance
```

outside access nahi hoga.

---

# 🔥 Delegates in Kotlin

Delegates reusable logic provide karte hain.

---

# 🟣 by keyword

```kotlin
by
```

delegate use karta hai.

---

# 📌 Example

```kotlin
val name by lazy {
    "Subh"
}
```

---

# 🧠 lazy Meaning

Value tab create hogi:
> jab first time use hogi.

---

# 🔥 Smart Home Analogy

Imagine:

```text
Smart Home App
```

Classes ho sakte hain:
- Light
- Fan
- TV
- AC

Objects:

```text
Living Room Light
Bedroom Fan
Kitchen AC
```

---

# 🟣 Example

```kotlin
class Light {

    fun turnOn(){
        println("Light ON")
    }

}
```

Object:

```kotlin
val roomLight = Light()
```

---

# 📌 Important Terms

| Term | Meaning |
|---|---|
| Class | Blueprint |
| Object | Instance |
| Property | Variable inside class |
| Function | Behavior |
| Constructor | Initializes object |
| Inheritance | Parent-child relation |
| Override | Modify inherited behavior |
| Encapsulation | Wrap data + behavior |
| Abstraction | Hide internal details |
| Polymorphism | Same function, different behavior |

---

# 🚀 Complete Real Example

```kotlin
open class Animal(val name: String){

    open fun sound(){
        println("Animal sound")
    }

}

class Dog(name: String) : Animal(name){

    override fun sound(){
        println("$name says Bark")
    }

}

fun main(){

    val dog1 = Dog("Tommy")

    dog1.sound()

}
```

Output:

```bash
Tommy says Bark
```

---

# 🧠 Final Understanding

Classes and Objects programming ka foundation hain.

Agar tum:
- classes
- objects
- inheritance
- polymorphism

deeply samajh gaye,

toh tum:
✅ Android Development  
✅ Backend Development  
✅ Game Development  
✅ Large Software Systems  

sab easily samajh paoge.

---

# 📌 One-Line Summary

> Class ek blueprint hota hai aur object us blueprint ka actual instance hota hai jo real data aur behavior hold karta hai.

---

# 🏁 End Note

Agar tumne ye pura documentation ek baar deeply padh liya:

toh:
- Classes
- Objects
- OOP
- Inheritance
- Encapsulation
- Polymorphism
- Abstraction
- Delegates

sab concepts lifetime ke liye clear ho jayenge 🚀

---
