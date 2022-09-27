 
listView('asdasdasdasd Jobs') {
    description('asdasdasdasd Jobs')
    jobs {
        regex('asdasdasdasd_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
