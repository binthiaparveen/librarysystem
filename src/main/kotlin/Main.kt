fun searchByAuthor(author: String) {
        var isAvailable:Boolean = false
        for (book in books) {
            if (!book.isBorrowed && book.author == author) {
                println("${book.title} by ${book.author} (${book.publicationYear})")
                isAvailable = true
                break
            }
        }
        if (!isAvailable) {
            println("Not Available book")
        }

    }

    fun searchByYear(year: Int) {
        var isAvailable:Boolean = false
        for (book in books) {
            if (!book.isBorrowed && book.publicationYear == year) {
                println("${book.title} by ${book.author} (${book.publicationYear})")
                isAvailable = true
                break
            }

        }
        if (!isAvailable) {
            println("Not Available book")
        }
    }

