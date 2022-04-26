# **ARRAYS AVERAGE**

# Information

* **Program that calculates the mean and harmonic mean of the elements in the array.**

# Technologies Used

* **JAVA**

# Contents

* The variables **int** and **double** are defined with int.

* A series called List was created and numbers were determined in this array.

* Using the for loop, first the average of the numbers and then the average of the harmonic values ​​of the numbers were calculated.

<br />

# Codes

```Java

        public class ArraysAverage{

            public static void main(String[] args) {

                int[] list = {55, 25, 40, 65, 70, 35};

                double sum = 0;

                double sum1 = 0.0;


```

```Java

                for(int i = 0; i < list.length; i++){

                sum += list[i];

                }

                System.out.println("Average : " + sum / list.length);
                

                for(int i = 1; i <= list.length; i++){

                    sum1 += (1.0 / i);

                }

                System.out.println("Harmonic Average : " + sum1);




            }
        }

```

```bash

    Average : 48.333333333333336
    Harmonic Average : 2.4499999999999997

```

<br />

# LINK

* Click here https://github.com/Fogo9/ArraysAverage.git to access the Github page for this project.

<br />

# LICENSE

* This software is licensed By Tuncay Demir under the MIT license.

<br />

>[Patika.dev](https://app.patika.dev/fogomurphy)

<br/>

| Name |  Email |
| ---- |  ----- |
| Tuncay | tuncaydemir682@gmail.com |
