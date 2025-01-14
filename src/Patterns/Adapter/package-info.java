package Patterns.Adapter;

/*
* Duck -------> DuckAdapter ------> Turkey
* DuckAdapter will implement Turkey interface and have composition duck to call Duck's function under the hood
* giving the idea of Turkey behaving as Duck
*
* Turkey ------> TurkeyAdapter ------> Duck
* so i will have turkey adapter which will implement duck and have object of turkey
* calling duck function, we will call turkey below the hood
*
* */