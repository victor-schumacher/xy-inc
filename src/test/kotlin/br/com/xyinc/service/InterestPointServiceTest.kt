package br.com.xyinc.service

import br.com.xyinc.model.InterestPoint
import br.com.xyinc.repository.InterestPointRepository
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock


class InterestPointServiceTest {

    private val interestPointRepository = mock(InterestPointRepository::class.java)

    private val interestPointService = InterestPointService(interestPointRepository)

    private fun setUp(){
        `when`(interestPointRepository.findAll()).thenReturn(listOf(
                InterestPoint("2", "padaria", 10, 20),
                InterestPoint("3", "boate", 15, 35),
                InterestPoint("3", "loja", 150, 352),
                InterestPoint("4", "teste", 5, 10)
        ))
    }

    @Test
    fun `should list some interest points`() {
        setUp()
        val listByDistance = interestPointService.listByDistance(5, 10, 15)

        assertEquals("2", listByDistance[0].id)
        assertEquals("4", listByDistance[1].id)

    }

}