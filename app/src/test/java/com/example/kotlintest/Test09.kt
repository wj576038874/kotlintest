package com.example.kotlintest



/**
 * author: wenjie
 * date: 2021-08-06 12:53
 * descption:
 */

fun main() {

    val json = """[["0","0.3"],["0","0.3"],["0","0.3"],["0","0.3"],["0","0.3"],["0","0.3"],["0","0.3"],["0","0.3"],["20","20.4"],["0","0.3"],["0","0.3"],["0","0.3"],["20","20.4"],["0","0.3"],["0","0.3"],["0","0.3"],["0","0.3"],["20","21.8"],["2","1.68"],["0","0.3"],["0","0.3"],["0","0.3"],["0","0.3"],["0","0.3"],["20","22.6"],["8","7.87"],["8","7.87"],["8","7.87"],["8","7.87"],["8","7.87"],["8","7.87"],["8","7.87"],["8","7.87"],["8","7.87"],["8","7.87"],["8","7.87"],["8","7.87"],["18","18.08"],["18","18.08"],["18","18.08"],["18","18.08"],["18","18.08"],["18","18.08"],["18","18.08"],["18","18.08"],["18","18.08"],["18","18.08"],["18","18.08"],["18","18.08"],["27","26.64"],["27","26.64"],["27","26.64"],["27","26.64"],["27","26.64"],["27","26.64"],["27","26.64"],["27","26.64"],["27","26.64"],["27","26.64"],["27","26.64"],["27","26.64"],["0","0.3"],["0","0.3"],["0","0.3"],["20","22.6"],["9","8.19"],["9","8.19"],["10","9.2"],["9","8.46"],["0","0.3"],["0","0.3"],["0","0.3"],["20","22.6"],["0","0.3"],["20","21.2"],["8","7.2"],["10","8.7"],["9","8.37"],["2","1.68"],["9","8.19"],["9","8.19"],["9","8.19"],["9","8.19"],["9","8.19"],["9","8.19"],["15","15.22"],["15","15.22"],["15","15.22"],["15","15.22"],["15","15.22"],["15","15.22"],["15","15.22"],["15","15.22"],["15","15.22"],["15","15.22"],["8","7.2"],["9","8.19"],["0","0.21"],["15","14.55"],["0","0.3"],["18","18.0"],["9","8.57"],["9","8.57"],["9","8.57"],["9","8.57"],["9","8.57"],["9","8.57"],["9","8.57"],["9","8.57"],["6","5.28"],["8","7.6"],["8","7.6"],["8","7.6"],["8","7.6"],["8","7.6"],["8","7.6"],["8","7.6"],["8","7.6"],["8","7.6"],["8","7.6"],["8","7.6"],["20","21.87"],["20","21.87"],["20","21.87"],["20","21.87"],["20","21.87"],["20","21.87"],["20","21.87"],["20","21.87"],["20","21.87"],["7","6.23"],["0","0.3"],["10","8.3"],["17","16.83"],["0","0.3"],["0","0.3"],["0","0.3"],["0","0.3"],["20","21.4"],["6","5.28"],["11","10.23"],["0","0.3"],["0","0.3"],["0","0.3"],["20","20.4"],["9","9.0"],["9","9.0"],["9","9.0"],["9","9.0"],["9","9.0"],["9","9.0"],["9","9.0"],["9","9.0"],["9","9.0"],["9","9.0"],["9","9.0"],["9","9.0"],["19","19.19"],["19","19.19"],["19","19.19"],["19","19.19"],["19","19.19"],["19","19.19"],["19","19.19"],["19","19.19"],["19","19.19"],["19","19.19"],["19","19.19"],["19","19.19"],["0","0.3"],["0","0.3"],["20","20.4"],["16","15.68"],["10","8.8"],["9","8.46"],["4","3.44"],["0","0.3"],["0","0.3"],["0","0.3"],["0","0.3"],["20","20.4"],["9","8.55"],["9","8.55"],["9","8.55"],["9","8.55"],["9","8.55"],["9","8.55"],["9","8.55"],["9","8.55"],["9","8.55"],["9","8.55"],["9","8.55"],["9","8.55"],["19","19.19"],["19","19.19"],["19","19.19"],["19","19.19"],["19","19.19"],["19","19.19"],["19","19.19"],["19","19.19"],["19","19.19"],["19","19.19"],["19","19.19"],["19","19.19"],["28","27.12"],["28","27.12"],["28","27.12"],["28","27.12"],["28","27.12"],["28","27.12"],["28","27.12"],["28","27.12"],["28","27.12"],["28","27.12"],["28","27.12"],["28","27.12"],["0","0.3"],["0","0.3"],["0","0.3"],["0","0.3"],["0","0.3"],["0","0.3"],["0","0.3"],["0","0.3"],["0","0.3"],["20","20.4"],["9","8.1"],["2","1.68"],["16","16.48"],["4","3.48"]]""".trim()

    val str = MyOwner.fromJson(json)
    val s = str.sumOf {
        it.distance5.toDouble()
    }

    print(s)


}

