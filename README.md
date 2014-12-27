HMM1 Next Emission Distribution
====

Homework in DD2380 Artificial Intelligence.

Problem description is taken from kattis.

URL: https://kth.kattis.com/problems/kth%3Aai%3Ahmm1

Problem Description
----
In this task you should show that you know how to predict how the system will evolve over time and estimate the probability for different emissions / events in the system i.e. what can be observed from the HMM. You will be given the state probability distribution (i.e. the probability that the system is in each of the N states), the transition matrix (i.e. the matrix that gives the probability to transition from one state to another) and the emission matrix (i.e. the matrix that gives the probability for the different emissions / events / observations given a certain state).

More specifically, given the current state probability distribution what is the probabity for the different emissions after the next transition (i.e. after the system has made a single transition)?

Input
----
You will be given three matrices (in this order); transition matrix, emission matrix, and initial state probability distribution. The initial state probability distribution is a row vector encoded as a matrix with only one row. Each matrix is given on a separate line with the number of rows and columns followed by the matrix elements (ordered row by row).

Output
----
You should output the emission probability distribution on a single line in the same matrix format, including the dimensions.
