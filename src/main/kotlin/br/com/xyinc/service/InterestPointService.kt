package br.com.xyinc.service

import br.com.xyinc.model.InterestPoint
import br.com.xyinc.repository.InterestPointRepository
import org.springframework.stereotype.Component

@Component
class InterestPointService(private val interestPointRepository: InterestPointRepository) {

    fun save(interestPoint: InterestPoint): InterestPoint {
        return interestPointRepository.save(interestPoint)
    }

    fun listAll(): MutableList<InterestPoint> {
        return interestPointRepository.findAll().toMutableList()
    }

    fun listByDistance(inputX: Int, inputY: Int, maxDistance: Int): MutableList<InterestPoint> {
        val allInterestPoints: MutableList<InterestPoint> = interestPointRepository.findAll().toMutableList()
        val nearPoints: MutableList<InterestPoint> = arrayListOf()
        var coordinatesDifference : Int

        for(i in 0 until allInterestPoints.size){

            coordinatesDifference = (allInterestPoints[i].x.minus(inputX)) + (allInterestPoints[i].y.minus(inputY))

            if(coordinatesDifference <= maxDistance){

                nearPoints.add(allInterestPoints[i])
            }
        }
        return nearPoints
    }
}