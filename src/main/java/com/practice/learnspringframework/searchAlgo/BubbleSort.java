package com.practice.learnspringframework.searchAlgo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSort implements BinarySearchLauncher{


    @Override
    public int[] sortAlgo(int[] numbers) {
    return numbers;
    }
}
