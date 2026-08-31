import java.util.Random

const val MAX_NUMBER_BOOKS = 20

class Book(val title: String, val author: String, val year: Int, var pages: Int = 500) {

    fun getTitleAuthor(): Pair<String, String> {
        return (title to author)
    }

    fun getTitleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }

    fun canBorrow(hasBooks: Int): Boolean {
        return (hasBooks < MAX_NUMBER_BOOKS)
    }

    fun printUrl() {
        println(Constants.BASE_URL + title + ".html")
    }

    companion object {
        val BASE_URL = "http://www.turtlecare.net/"
    }
}

object Constants {
    const val BASE_URL = "http://www.turtlecare.net/"
}

fun Book.weight(): Double {
    return (pages * 1.5)
}

fun Book.tornPages(torn: Int) {
    pages = if (pages >= torn) pages - torn else 0
}

class Puppy {
    fun playWithBook(book: Book) {
        book.tornPages(Random().nextInt(12))
    }
}

fun main(args: Array<String>) {
    val puppy = Puppy()
    val book = Book("Oliver Twist", "Charles Dickens", 1837, 540)

    while (book.pages > 0) {
        puppy.playWithBook(book)
        println("${book.pages} left in ${book.title}")
    }
    println("Sad puppy, no more pages in ${book.title}.")
}