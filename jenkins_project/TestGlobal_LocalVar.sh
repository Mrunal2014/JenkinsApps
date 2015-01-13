#!/bin/bash
var="global variable"
function bash {
VAR="local variable"
echo $VAR
}
echo $VAR
bash
echo $VAR