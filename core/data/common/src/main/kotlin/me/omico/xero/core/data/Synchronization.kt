package me.omico.xero.core.data

interface Synchronizer {
    suspend fun Syncable.sync() = syncWith(this@Synchronizer)
}

interface Syncable {
    suspend fun syncWith(synchronizer: Synchronizer): Boolean
}
