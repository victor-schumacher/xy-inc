package br.com.xyinc.controller

import br.com.xyinc.model.InterestPoint
import br.com.xyinc.service.InterestPointService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("coordinates")
class InterestPointController(private val interestPointService: InterestPointService) {

    @RequestMapping("addCoordinate")
    @PostMapping
    fun add(@RequestBody interestPoint: InterestPoint): ResponseEntity<InterestPoint> {
        val savedInterestPoint = interestPointService.save(interestPoint)
        return ResponseEntity.ok(savedInterestPoint)
    }

    @RequestMapping("listAll")
    @GetMapping
    fun listAll(): ResponseEntity<List<InterestPoint>> {
        val allInterestPoints = interestPointService.listAll()
        return ResponseEntity.ok(allInterestPoints)
    }

    @RequestMapping("closePoints")
    @GetMapping
    fun listByDistance(@RequestParam inputX:Int,
                       @RequestParam inputY:Int,
                       @RequestParam distance:Int
                       )
    : ResponseEntity<List<InterestPoint>>
    {
        val closeInterestPoints = interestPointService.listByDistance(inputX, inputY, distance)
        return ResponseEntity.ok(closeInterestPoints)
    }

}