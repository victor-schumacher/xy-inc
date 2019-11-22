package br.com.xyinc.test.service

import br.com.xyinc.model.InterestPoint
import br.com.xyinc.repository.InterestPointRepository
import br.com.xyinc.service.InterestPointService
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class InterestPointServiceTest {


    @Test
    fun `should list all interest points`()
    {
        lateinit var interestPointRepository : InterestPointRepository

        val interestPoint = InterestPoint(name = "Restaurante pé de fava", x = 10, y = 20)
        val interestPoint1 = InterestPoint(name = "Drogaria Catarinense", x = 15, y = 25)
        val interestPoint2 = InterestPoint(name = "Hospital infantil", x = 20, y = 30)

        val interestPointService = InterestPointService(interestPointRepository)

        interestPointService.save(interestPoint)
        interestPointService.save(interestPoint1)
        interestPointService.save(interestPoint2)

        val listOfInterestPoints : MutableList<InterestPoint> = interestPointService.listAll()

        val listOfInterestPointsOk : MutableList <InterestPoint> = arrayListOf(interestPoint, interestPoint1, interestPoint2)

        println(listOfInterestPointsOk)

    }

}