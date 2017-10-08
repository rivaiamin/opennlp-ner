Generate Models
- cd entity-extraction/target
- java -cp modelbuilder-addon-1.0-SNAPSHOT-jar-with-dependencies.jar com.itq.ner.CreateModel [NER_TYPE] [ITERATION]
- example: java -cp modelbuilder-addon-1.0-SNAPSHOT-jar-with-dependencies.jar com.itq.ner.CreateModel person 1

Training Models
- cd entity-extraction
- opennlp/bin/opennlp TokenNameFinderTrainer -model [PATH_TO_MODEL] -lang [LANG_ID] -data [PATH_TO_TRAINING_FILE]
- opennlp/bin/opennlp TokenNameFinderTrainer -model models/person/itq-person-model.bin -lang id -data models/person/annotatedSentences.txt

Running Entity Extraction
- cd entity-extraction
- opennlp/bin/opennlp TokenNameFinder [PATH_TO_MODEL] < [PATH_TO_INPUT] > [PATH_TO_OUTPUT]
- example: opennlp/bin/opennlp TokenNameFinder models/person/itq-person-model.bin < docs/eks4/sura_2.txt > docs/eks4/output.txt

TO-DO: 
- buat arsitektur untuk untuk keseluruhan dan alur dokumennya
- Sempurnakan modelnya