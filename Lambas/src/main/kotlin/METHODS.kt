enum class METHODS() {
    APPLY, WITH, DEFAULT;
    companion object{
        fun availableOptions(): StringBuilder {
            val options = StringBuilder()
            options.append("1. $APPLY\n")
            options.append("2. $WITH\n")
            options.append("Any number. $DEFAULT\n")
            return options
        }
    }
}