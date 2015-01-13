#!/bin/bash
num1=1234
let "num1 += 1"
echo "num1 = $num1 "
num=${num1/23/BB}
echo "num = $num"
declare -i num
echo "num = $num"
num3=BB34
echo "num3 = $num3"