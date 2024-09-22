INSERT INTO question(id, question) VALUES (1, "Hur långt syns en mörkklädd person i halvljus?");
INSERT INTO answer(id, question_id, answer, correct) VALUES (1, 1, "20 - 30 meter", true);
INSERT INTO answer(id, question_id, answer, correct) VALUES (2, 1, "50 - 60 meter", false);
INSERT INTO answer(id, question_id, answer, correct) VALUES (3, 1, "60 - 70 meter", false);

INSERT INTO question(id, question) VALUES (2, "Hur många viltolyckor sker det per år?");
INSERT INTO answer(id, question_id, answer, correct) VALUES (4, 2, "60 000", true);
INSERT INTO answer(id, question_id, answer, correct) VALUES (5, 2, "100 000", false);
INSERT INTO answer(id, question_id, answer, correct) VALUES (6, 2, "150 000", false);

INSERT INTO question(id, question) VALUES (3, "Hur många personer omkommer årligen i trafiken i Sverige?");
INSERT INTO answer(id, question_id, answer, correct) VALUES (7, 3,"Ca 100 personer", true);
INSERT INTO answer(id, question_id, answer, correct) VALUES (8, 3,"Ca 200 personer", false);
INSERT INTO answer(id, question_id, answer, correct) VALUES (9, 3,"Ca 300 personer", false);
INSERT INTO answer(id, question_id, answer, correct) VALUES (10, 3,"Ca 400 personer", false);