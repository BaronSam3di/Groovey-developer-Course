//def xml = '''
//    <sports>
//        <sport>
//            <name>Baseball</name>
//        </sport>
//    </sports>
//'''
//
//def sports = new XmlSlurper().parseText(xml)
//
//println sports.class.name
//println sports.sport.name


def sports = new XmlSlurper().parse('data/sports.xml')
println sports.sport[2].name