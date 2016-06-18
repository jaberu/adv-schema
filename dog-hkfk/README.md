dog-hkfk
========

dog-hkfk is Jaxb binding representation of the DOG-Profil HKFK

http://www.adv-online.de/AdV-Produkte/Standards-und-Produktblaetter/AdV-Profile/binarywriterservlet?imgUid=e8060312-b3c1-8541-cc29-56f2072e13d6&uBasVariant=11111111-1111-1111-1111-111111111111

# ogc schema

As an extension of the ogc specification the artifacts of https://github.com/highsource/ogc-schemas are used.

# Change Log

Some parts of the original schema needed to be changed. 

* schema locations were changed as workaround for https://java.net/jira/browse/JAXB-1044
* `StrassenType#parent` type was changed to match definition of `iso19112:SI_LocationInstanceType#parent`
* all `name` element were changed from type `xsd:string` to `gml:CodeType` to match the definition of ``