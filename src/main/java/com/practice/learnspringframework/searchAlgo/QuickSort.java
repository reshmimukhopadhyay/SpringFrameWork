package com.practice.learnspringframework.searchAlgo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSort implements BinarySearchLauncher{


    @Override
    public int[] sortAlgo(int[] numbers) {
        return numbers;
    }
}
