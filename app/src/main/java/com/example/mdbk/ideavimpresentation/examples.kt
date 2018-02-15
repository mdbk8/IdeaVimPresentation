package com.example.mdbk.ideavimpresentation

import android.view.View
import org.junit.Test













// i - enables 'Insert mode" - normal cursor
// Esc - returns back to navigation mode, called 'Normal mode/command mode' - thick cursor
// You switch between those two modes all the time :)
// v - visual mode (selection)

fun printMessage(message: String) = println("The message as follows : $message")



























// o - insert new line below current line
// O - insert new line above current line
// i - insert text at cursor position
// a - insert text after cursor position

// shift(⇧) + Enter - start new line is sometimes more convenient
// shift(⇧) + Return - delete empty line

fun funcToBeImplemented(string: String?): String {
    return "Vim is awesome"
}

























// Basic navigation:
// j - down
// k - up
// h - left
// l - right

class ClassForNavigation {

    fun firstFunc() {

        iAmPrivate()
        anotherPrivateJob()
    }

    private fun iAmPrivate() {
        println("doing some private stuff")
    }

    private fun anotherPrivateJob() = "test"
}



























// Move between words back and forth
// w (word) - move cursor to the next word
// b (back) - move cursor to the previous word - move back
// e (end) - move cursor to the end of word

fun combineTwoStrings(first: String, second: String): String {

    return "$first is combined with $second"
}




























// More 'spread' navigation can be achieved with jump to blank lines
// { - jumps to previous blank line
// } - jumps to next blank line

class ClassForJumpNavigation {

    fun firstFunc() {

    }

    private fun iAmPrivate() {
        println("doing some private stuff")

        // TODO add implementation
    }

    private fun anotherPrivateJob() = "test"
}




























// 	[{ - jump to start of current code block (to { char)
//  ]} - jump to end of current code block (to } char)
//  [( - jump to the beginning of parenthesis '(' ')' block (e.g. function args)
//  ]) - jump to the end of parenthesis '(' ')' block (e.g. function args)

class VimPresenter(
    private val view: VimView,
    private val interactor: VimInteractor,
    private val mapper: VimMapper,
    private val validator: VimValidator
) {

    fun showCommands() {
        interactor.getBestCommands()
            .forEach { view.showCommand(mapper.map(it)) }
    }


    fun saveCommand(newCommand: String) {
        validator.validate(newCommand)
    }


}

































// Edit commands:
// v (visual) - select (think of it as making something more visual)
// d (delete) - delete (but it cuts into buffer)
// p (paste) - paste from buffer
// c (change)- delete (cut) and activate 'Insert mode' (think of it as change something)
// y (yank) - the same as copy

// Range commands:
// i (inside) - within 'structure'
// a (o(a)utside)- all 'structure'

// structure:
// w - word
// or :
//    []
//    ''
//    ``
//    ""
//    {} - B is a kind of alias
//    () - b is a kind of alias





























// dd - deletes current line
// . - repeat last action (in a broad sense)

class WithManyLinesToDelete {
    // TODO I should not be here

    fun veryUsefulFunction() {
        printMessage("")
    }

    fun `cool feature of Kotlin language`() = ""

    // TODO line to delete
    // TODO express your feelings
}

































// u - undo changes
// Ctrl - r - revert undo changes

private fun somethingToRevert() {
    printMessage("I want to be changed")
    val message = "and then reverted"
    printMessage(message)
}



































// x - delete (cut) character under cursor
// xp - swap two characters (e.x. misspelled word)
// r (replace) - replace one character without entering 'Insert mode'

fun validateVacations(person: Person) {

    if (person is Employee) {
        if (person.vacationDays > 20) {
           printMessage("You need to take some moer timo off!")
        }
    }
}





























// code withing (parentheses)
// dib (delete inside brackets) - delete content in parenthesis '(' ')' block
// cib (change inside brackets) - change content in parenthesis '(' ')' block - puts you into 'Insert mode'

fun String.hello(whoSaidThat: String) = printMessage("Hello, it's me!")


// TODO move factory to method argument
class DaggerModule(private val factory: RepositoryFactory) {

    fun provideRepository(): Repository {
        return factory.create(Repository::class.java)
    }
}
























// code withing { curly braces }
// diB - delete content within { } block
// ciB - change content within { } block - puts you into 'Insert mode'

fun validateVacationsSecondTime(person: Person) {

    // TODO ugly code, rewrite
    if (person is Employee) {
        if (person.vacationDays > 20) {
            printMessage("You need to take some moer timo off!")
        }
    }
}

// daB/{

interface Factory {

    fun makeInstanceForMe(): Any {

        return Any()
    }
}






















// delete/change single word
// daw (delete a/outside word) - delete a word and put cursor at the beginning of next word
// ciw (change inside word) - change a word: deletes a word, put you into 'Insert mode' and sets
// cursor at the beginning of deleted word

// there are of course 'diw' and 'caw' combinations

// dw - delete from current cursor location to the end of the word

// with deleting/changing we can combine back tick (`) symbol

// Expand/shrink selection (⌥↑/⌥↓) command doesn't work well in this case

class TestClass {

    @Test
    fun `test case should test logic really`() {

    }

    @Test
    fun `this test case name is really horrible really`() {

    }
}





























// A - go to the end of current line and enter Insert mode
// I - go to the beginning of current line and enter Insert mode

// $ - go to the end of current line
// ^ - go to the beginning of current line

class JustDeclaration
































// cc - deletes current line and puts into insert mode

class OnClick: View.OnClickListener {

    override fun onClick(p0: View?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}



























// search(find) in line with f/t + char
// ; - go to next occurrence
// , - go to previous occurrence

// useful with deleting df/dt + symbol
// t is also search command, like f, but places cursor before searched word

// F/T - searches backwards

class LoginPresenterImpl(arg: String) : LoginMVP.Presenter {

    init {
        println(arg)
    }
}


// '/' + searched text
// n - go to next
// N - go to previous







































// cut the whole line with 'dd' and replace another line with 'V'

class DslClass(
    shouldBeLast: String.() -> Unit,
    oneArg: String,
    private val removeMe: String
) {
    init {
        oneArg.shouldBeLast()
    }
}


fun desiredUsage() {

    DslClass("string", "unused") {
        println("Length of oneArg argument is $length")
    }
}





































// * - search forward for word under cursor (pressing 'n' wil move you to the nex occurrence, 'N' to previous)
// similar functionality in IDE - Highlight Usages in File (⇧⌘F7) and go to next/previous occurrence ⌘G/⇧⌘G

class ArtistRepositoryImp(private val artistDataSets: List<ArtistDataSet>) : ArtistRepository {

    override fun getRecommendedArtists(): List<Artist> {
        for (dataSet in artistDataSets) {
            val result = dataSet.requestRecommendedArtists()
            if (result.isNotEmpty()) {
                return result
            }
        }

        return emptyList()
    }

    override fun getArtist(id: String): Artist {
        for (dataSet in artistDataSets) {
            val result = dataSet.requestArtist(id)
            if (result != null) {
                return result
            }
        }
        return Artist("empty", "empty", "empty")
    }
}

// You can do custom keymap mapping with h j k l keys, like:
//  - Expand/shrink selection
//              option(⌥) + j/k
//  - Navigate to next/previous declarations
//              control(⌃) + option(⌥) + j/k
//  - Move statement up/down
//              control(⌃) + option(⌥) + command(⌘) + k/j
//  - Move line up/down
//              option(⌥) + shift(⇧) + k/j
