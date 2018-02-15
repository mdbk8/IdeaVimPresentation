package com.example.mdbk.ideavimpresentation

open class Person

class Employee : Person() {
    var vacationDays = 30
}


data class Command(val sequence: String)

interface VimView  {

    fun showCommand(command: String)
}

interface VimInteractor {

    fun getBestCommands(): List<Command>
}

interface VimMapper {

    fun map(command: Command) : String
}

interface VimValidator {

    fun validate(commandSequence: String)
}


interface VimLogger {
    fun logCommand(command: String)
}


interface RepositoryFactory {

    fun <T> create(repoClass: Class<T>): T
}

class Repository

interface ArtistRepository {
    fun getRecommendedArtists(): List<Artist>
    fun getArtist(id: String): Artist
}

data class Artist(
    val id: String,
    val name: String,
    val url: String? = null,
    val bio: String? = null,
    val albums: List<Album>? = null)

class Album

interface ArtistDataSet {

    fun requestRecommendedArtists(): List<Artist>
    fun requestArtist(id: String): Artist?
}


interface LoginMVP {

    interface View

    interface Presenter
}