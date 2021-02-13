// write the classes here
data class OperatingSystem(var name: String = "osx")

data class DualBoot(var primaryOs: OperatingSystem = OperatingSystem("osx"),
                    var secondaryOs: OperatingSystem = OperatingSystem("linux"))