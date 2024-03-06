package calculadora.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import calculadora.exceptions.UnsupportedMathOperationException;
import calculadora.model.SimpleMath;
import calculadora.util.NumberConverter;

@RestController
public class MatchController {
    SimpleMath simpleMath = new SimpleMath();

    @GetMapping("/sum/{n1}/{n2}")
    public Double getSum(@PathVariable("n1") String n1, @PathVariable("n2") String n2) {
        return this.simpleMath.sum(Double.valueOf(n1), Double.valueOf(n2));
    }

    @GetMapping("/sub/{n1}/{n2}")
    public Double getSub(@PathVariable("n1") String n1, @PathVariable("n2") String n2) {
        return this.simpleMath.sub(Double.valueOf(n1), Double.valueOf(n2));
    }

    @GetMapping("/mult/{n1}/{n2}")
    public Double getMult(@PathVariable("n1") String n1, @PathVariable("n2") String n2) {
        return this.simpleMath.mult(Double.valueOf(n1), Double.valueOf(n2));
    }

    @GetMapping("/div/{n1}/{n2}")
    public Double getDiv(@PathVariable("n1") String n1, @PathVariable("n2") String n2) {
        return this.simpleMath.div(Double.valueOf(n1), Double.valueOf(n2));
    }

    @GetMapping("/mean/{n1}/{n2}")
    public Double getMean(@PathVariable("n1") String n1, @PathVariable("n2") String n2) {
        return this.simpleMath.mean(Double.valueOf(n1), Double.valueOf(n2));
    }

    @GetMapping("/isNumeric/{numberOne}/{numberTwo}")
    public Double sum(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) throw new UnsupportedMathOperationException("Please set a numeric value!");
            return this.simpleMath.sum(NumberConverter.convertToDouble(numberOne),
                NumberConverter.convertToDouble(numberTwo));
    }
}
