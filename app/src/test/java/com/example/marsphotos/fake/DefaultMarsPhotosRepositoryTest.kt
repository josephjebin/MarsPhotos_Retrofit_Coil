package com.example.marsphotos.fake

import com.example.marsphotos.data.DefaultMarsPhotosRepository
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Test

class DefaultMarsPhotosRepositoryTest {


    @Test
    fun defaultMarsPhotosRepository_getMarsPhotos_verifyPhotoList() = runTest{
        val repository = DefaultMarsPhotosRepository(
            marsApiService = FakeMarsApiService()
        )

        assertEquals(FakeDataSource.photosList, repository.getMarsPhotos())
    }
}