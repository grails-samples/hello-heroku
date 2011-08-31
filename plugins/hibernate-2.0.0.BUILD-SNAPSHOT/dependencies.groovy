grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir	= "target/test-reports"
grails.project.work.dir="target/work"

grails.project.dependency.resolution = {
    inherits "global" // inherit Grails' default dependencies
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
	repositories {
		grailsCentral()
	}
    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.
	  	compile( 'org.hibernate:hibernate-core:3.6.5.Final' ){
			excludes 'slf4j-api', 'commons-collections'
		}
	    compile( 'org.hibernate:hibernate-validator:4.1.0.Final' ) {
			excludes 'slf4j-api', 'commons-collections'
		}

		runtime 'javassist:javassist:3.11.0.GA'
		runtime 'antlr:antlr:2.7.6'		
		runtime( 'dom4j:dom4j:1.6.1' ) {
			excludes 'xml-apis'
		}				
		runtime( 'org.hibernate:hibernate-ehcache:3.6.5.Final' ) {
			excludes 'ehcache', 'hibernate-core','slf4j-api', 'commons-collections'
		}
		
    }

	plugins {
		build( ":release:1.0.0.RC3" ) {
			export = false
		}
	}
}
