package exceptions

class InvalidValueException(val value: Double) : RuntimeException("Value $value is not valid")