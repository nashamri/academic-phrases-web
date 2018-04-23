(ns academic-phrases-web.phrases)

(def all-phrases
  {:cat1 {:title "Establishing why your topic X is important"
          :items [
                  {:id 1
                   :template "X is the [{1}] cause of ..."
                   :choices [["main" "leading" "primary" "major"]]}
                  {:id 2
                   :template "Xs are a [{1}] part of ..."
                   :choices [["common" "useful" "critical"]]}
                  {:id 3
                   :template "Xs are among the most [{1}] types of ..."
                   :choices [["widely used" "commonly discussed" "well-known" "well-documented" "widespread" "commonly investigated"]]}
                  {:id 4
                   :template "X is [{1}] the most important ..."
                   :choices [["is recognized as being" "believed to be" "widely considered to be"]]}
                  {:id 5
                   :template "It is [{1}] that X is ..."
                   :choices [["well known" "generally accepted" "common knowledge"]]}
                  {:id 6
                   :template "X [{1}] a vital factor in ..."
                   :choices [["is increasingly becoming" "set to become"]]}
                  {:id 7
                   :template "Xs are [{1}] in terms of ..."
                   :choices [["undergoing a revolution" "generating considerable interest"]]}
                  {:id 8
                   :template "Xs are attracting [{1}] interest due to ..."
                   :choices [["considerable" "increasing" "widespread"]]}
                  {:id 9
                   :template "X has many [{1}] in the field of ..."
                   :choices [["uses" "roles" "applications"]]}
                  {:id 10
                   :template "A [{1}] feature of ..."
                   :choices [["striking" "useful" "remarkable"]]}
                  {:id 11
                   :template "The [{1}] characteristics of X are:"
                   :choices [["main" "principal" "fundamental"]]}
                  {:id 12
                   :template "X [{1}] for"
                   :choices [["accounts" "is responsible"]]}]}
   :cat2 {:title "Outlining the past-present history of the study of X"
          :items [
                  {:id 13
                   :template "Last century X [{1}] the most ..."
                   :choices [["was considered to be" "viewed as" "seen as"]]}
                  {:id 14
                   :template "[{1}] studies of X considered it to be"
                   :choices [["Initial" "Preliminary" "The first"]]}
                  {:id 15
                   :template "[{1}], the focus has always been ..."
                   :choices [["Traditionally X" "In the history of X"]]}
                  {:id 16
                   :template "[{1}] have always seen X as ..."
                   :choices [["Scientists" "Researchers" "Experts"]]}
                  {:id 17
                   :template "[{1}] Xs have been considered as ..."
                   :choices [["Until now" "For many years" "Since 1942"]]}
                  {:id 18
                   :template "X has received much attention in the [{1}] ..."
                   :choices [["last two years" "in the past decade" "over the last two decades"]]}
                  {:id 19
                   :template "[{1}] there has been a rapid rise in the use of Xs"
                   :choices [["For the past five years" "Since 1942"]]}
                  {:id 20
                   :template "The last two years have [{1}] a huge growth in X ..."
                   :choices [["witnessed" "seen"]]}
                  {:id 21
                   :template "The [{1}] has seen a renewed importance in X ..."
                   :choices [["past decade" "last year"]]}
                  {:id 22
                   :template "Recent [{1}] X have led to ..."
                   :choices [["developments in" "findings regarding"]]}
                  {:id 23
                   :template "X has become a [{1}] issue in ..."
                   :choices [["central" "an important" "a critical"]]}]}
   :cat3 {:title "Outlining the possible future of X"
          :items [
                  {:id 24
                   :template "The next decade is likely to [{1}] a considerable rise in X"
                   :choices [["see" "witness"]]}
                  {:id 25
                   :template "In the next few years X [{1}]"
                   :choices [["will become" "is likely to have become"]]}
                  {:id 26
                   :template "Within the next few years, X is [{1}] to become an important component in ..."
                   :choices [["set" "destined" "likely"]]}
                  {:id 27
                   :template "[{1}], X will have become ..."
                   :choices [["By 2042" "Within the next ten years"]]}
                  {:id 28
                   :template "X will [{1}] be an issue that ..."
                   :choices [["soon" "shortly" "rapidly" "inevitably"]]}]}
   :cat4 {:title "Indicating the gap in knowledge and possible limitations"
          :items [
                  {:id 29
                   :template "Few researchers have addressed the [{1}] of ..."
                   :choices [["problem" "issue" "question"]]}
                  {:id 30
                   :template "Previous work has only [{1}] address ..."
                   :choices [["focused on" "been limited to" "failed to"]]}
                  {:id 31
                   :template "A [{1}] issue of ..."
                   :choices [["basic" "common" "fundamental" "crucial" "major"]]}
                  {:id 32
                   :template "The [{1}] problem of"
                   :choices [["central" "core"]]}
                  {:id 33
                   :template "[{1}] area in the field of ..."
                   :choices [["A challenging" "An intriguing" "An important" "A neglected"]]}
                  {:id 34
                   :template "Current solutions to X are [{1}]"
                   :choices [["inconsistent" "inadequate" "incorrect" "ineffective" "inefficient" "over-simplistic" "unsatisfactory"]]}
                  {:id 35
                   :template "Many hypotheses regarding X appear to be [{1}]"
                   :choices [["ill-defined" "unfounded" "not well grounded" "unsupported" "questionable" "disputable" "debatable"]]}
                  {:id 36
                   :template "The characteristics of X [{1}]."
                   :choices [["are not well understood" "are misunderstood" "have not been dealt with in depth"]]}
                  {:id 37
                   :template "It [{1}] whether X can do Y."
                   :choices [["is not yet known" "has not yet been established"]]}
                  {:id 38
                   :template "X is still [{1}] understood."
                   :choices [["poorly" "not widely"]]}
                  {:id 39
                   :template "X is often [{1}] ..."
                   :choices [["impractical" "not feasible" "costly"]]}
                  {:id 40
                   :template "Techniques to solve X are [{1}]."
                   :choices [["computationally demanding" "subject to high overheads" "time consuming" "impractical" "frequently unfeasible"]]}
                  {:id 41
                   :template "A major [{1}] of X is ..."
                   :choices [["defect" "difficulty" "drawback" "disadvantage" "flaw"]]}
                  {:id 42
                   :template "One of the main issues in [{1}] X is a lack of ..."
                   :choices [["our knowledge of" "what we know about"]]}
                  {:id 43
                   :template "This [{1}] area of X [{2}] ..."
                   :choices [["particular" "specific"] ["has been overlooked" "has been neglected" "remains unclear"]]}
                  {:id 44
                   :template "Despite this interest, no one [{1}] has studied ..."
                   :choices [["to the best of our knowledge" "as far as we know"]]}
                  {:id 45
                   :template "Although this approach is interesting, it [{1}] ..."
                   :choices [["suffers from" "fails to take into account" "does not allow for"]]}
                  {:id 46
                   :template "[{1}] its shortcomings, this method has been widely applied to ..."
                   :choices [["In spite of" "Despite"]]}
                  {:id 47
                   :template "However, there [{1}] ..."
                   :choices [["is still a need for" "has been little discussion on"]]}
                  {:id 48
                   :template "Moreover, other [{1}] have failed to provide ..."
                   :choices [["solutions" "research programs" "approaches"]]}
                  {:id 49
                   :template "Most studies [{1}] focus on ..."
                   :choices [["have only focused" "tended to"]]}
                  {:id 50
                   :template "[{1}] this methodology has only been applied to ..."
                   :choices [["To date" "Until now"]]}
                  {:id 51
                   :template "There is still [{1}] controversy surrounding ..."
                   :choices [["some" "much" "considerable"]]}
                  {:id 52
                   :template "There has been some disagreement [{1}] whether"
                   :choices [["concerning" "regarding" "with regard to"]]}
                  {:id 53
                   :template "There is [{1}] on ..."
                   :choices [["little" "no general agreement"]]}
                  {:id 54
                   :template "The community has raised some [{1}] about ..."
                   :choices [["issues" "concerns"]]}
                  {:id 55
                   :template "Concerns have [{1}] which [{2}] the validity of ..."
                   :choices [["arisen" "been raised"] ["question" "call into question"]]}
                  {:id 56
                   :template "In the light of recent events in x, there is now [{1}] concern about ..."
                   :choices [["some" "much" "considerable"]]}]}
   :cat5 {:title "Stating the aim of your paper and its contribution"
          :items [
                  {:id 57
                   :template "In this [{1}] we ..."
                   :choices [["report" "paper" "review" "study"]]}
                  {:id 58
                   :template "This paper [{1}] a new approach to ..."
                   :choices [["outlines" "proposes" "describes" "presents"]]}
                  {:id 59
                   :template "This paper [{1}] how to solve ..."
                   :choices [["examines" "seeks to address" "focuses on" "discusses" "investigates"]]}
                  {:id 60
                   :template "This paper is [{1}] ..."
                   :choices [["an overview of" "a review of" "a report on" "a preliminary attempt to"]]}
                  {:id 61
                   :template "The present paper aims to [{1}] Marvin’s findings regarding ..."
                   :choices [["validate" "call into question" "refute"]]}
                  {:id 62
                   :template "X is [{1}] in order to ..."
                   :choices [["presented" "described" "analyzed" "computed" "investigated" "examined" "introduced" "discussed"]]}
                  {:id 63
                   :template "The aim of our [{1}] was to [{2}] current knowledge of ..."
                   :choices [["work" "research" "study" "analysis"] ["further" "extend" "widen" "broaden"]]}
                  {:id 64
                   :template "Our knowledge of X is largely based on very limited data. The aim of the research was [{1}] to"
                   :choices [["thus" "therefore" "consequently"]]}
                  {:id 65
                   :template "The aim of this study is to [{1}] ..."
                   :choices [["study" "evaluate" "validate" "determine" "examine" "analyze" "calculate" "estimate" "formulate"]]}
                  {:id 66
                   :template "This paper [{1}] ..."
                   :choices [["calls into question" "takes a new look at" "re-examines" "revisits" "sheds new light on"]]}
                  {:id 67
                   :template "[{1}], we tried to ..."
                   :choices [["With this in mind" "Within the framework of these criteria" "In this context"]]}
                  {:id 68
                   :template "We [{1}] to ..."
                   :choices [["undertook this study" "initiated this research" "developed this methodology"]]}
                  {:id 69
                   :template "We believe that we have [{1}] an innovative solution to ..."
                   :choices [["found" "developed" "discovered" "designed"]]}
                  {:id 70
                   :template "We [{1}] solution for ..."
                   :choices [["describe" "present" "consider" "analyze a novel" "simple" "radical" "interesting"]]}]}
   :cat6 {:title "Explaining the key terminology in your field"
          :items [
                  {:id 71
                   :template "The term ‘X’ [{1}] ..."
                   :choices [["is generally understood to mean" "has come to be used to refer to" "has been applied to"]]}
                  {:id 72
                   :template "In the literature, X [{1}] to refer to ..."
                   :choices [["usually refers" "often refers" "tends to be used"]]}
                  {:id 73
                   :template "In the field of X, [{1}] Y can be found."
                   :choices [["several" "various" "many definitions of"]]}
                  {:id 74
                   :template "The term X [{1}] used by Marvin [2042] to refer to ..."
                   :choices [["is" "was" "has been"]]}
                  {:id 75
                   :template "Marvin uses the term X [2042] to [{1}] ..."
                   :choices [["refer to" "denominate"]]}
                  {:id 76
                   :template "X is defined by Marvin [1942] [{1}] ..."
                   :choices [["to refer to" "to mean"]]}
                  {:id 77
                   :template "Marvin [2042] has [{1}] a new definition of X, in which ..."
                   :choices [["provided" "put forward" "proposed"]]}
                  {:id 78
                   :template "X is [{1}] as ... [Marvin 2042]."
                   :choices [["defined" "identified" "described"]]}
                  {:id 79
                   :template "In the literature [{1}]."
                   :choices [["there seems to be no general definition of X" "a general definition of X is lacking" "there is no clear definition of X"]]}
                  {:id 80
                   :template "Several authors have attempted to define X, but [{1}] there is still no accepted definition."
                   :choices [["as yet" "currently" "at the time of writing"]]}
                  {:id 81
                   :template "In [{1}] terms, X is can be defined as a way to ..."
                   :choices [["broad" "general"]]}
                  {:id 82
                   :template "The [{1}] use of the term X refers to ..."
                   :choices [["broad" "general" "generally accepted"]]}
                  {:id 83
                   :template "X is sometimes [{1}] a series of ..."
                   :choices [["equated with" "embodies"]]}
                  {:id 84
                   :template "X, Y and Z are three [{1}] of languages."
                   :choices [["kinds" "types" "categories" "classes"]]}
                  {:id 85
                   :template "[{1}]: X, Y and Z."
                   :choices [["There are three kinds of languages" "The three kinds of languages are" "Languages can be divided into three kinds"]]}]}
   :cat7 {:title "Explaining how you will use terminology and acronyms in your paper"
          :items [
                  {:id 86
                   :template "The acronym X [{1}] ..."
                   :choices [["stands for" "denotes"]]}
                  {:id 87
                   :template "The subjects [{1}] are..."
                   :choices [["henceforth named" "hereafter 'X'"]]}
                  {:id 88
                   :template "The subject, which we shall [{1}] to as 'X', is ..."
                   :choices [["call" "refer"]]}
                  {:id 89
                   :template "Throughout this [{1}] we use the terms ‘mafia’ and ‘the mob’ interchangeably, [{2}] with the practice of this department where this study was conducted."
                   :choices [["paper" "section"] ["following" "in accordance"]]}
                  {:id 90
                   :template "The fonts, [{1}] the form of the characters, are of various types."
                   :choices [["i.e." "that is to say"]]}
                  {:id 91
                   :template "There are three different types, [{1}] : X, Y and Z."
                   :choices [["namely" "specifically"]]}
                  {:id 92
                   :template "[{1}] we [{2}] the term X to refer to ..."
                   :choices [["Throughout the" "In this paper"] ["use" "will use"]]}
                  {:id 93
                   :template "In this chapter X [{1}] to refer to ..."
                   :choices [["is used" "will be used"]]}
                  {:id 94
                   :template "In this paper the standard meaning of X [{1}]' used .."
                   :choices [["is" "will be"]]}
                  {:id 95
                   :template "This aspect [{1}] dealt with in more detail in Sect. 6."
                   :choices [["is" "will be"]]}
                  {:id 96
                   :template "We will [{1}] how relevant this is in the next subsection."
                   :choices [["see" "learn" "appreciate"]]}]}
   :cat8 {:title "Giving the structure of paper - what is and is not included"
          :items [
                  {:id 97
                   :template "This paper is organized as [{1}] into five sections."
                   :choices [["follows" "divided"]]}
                  {:id 98
                   :template "[{1}] gives a brief overview of ..."
                   :choices [["The first section" "Section 1"]]}
                  {:id 99
                   :template "The second section [{1}] ..."
                   :choices [["examines" "analyses"]]}
                  {:id 100
                   :template  "In the third section a case study is [{1}] ..."
                   :choices [["presented" "analyzed"]]}
                  {:id 101
                   :template  "A new methodology is [{1}] in the fourth section ..."
                   :choices [["described" "outlined"]]}
                  {:id 102
                   :template  "[{1}] propose a new procedure in Section 4."
                   :choices [["We" "I"]]}
                  {:id 103
                   :template  "[{1}] conclusions are drawn in the final section."
                   :choices [["Some" "Our"]]}
                  {:id 104
                   :template  "This [{1}] begins by examining ..."
                   :choices [["paper" "chapter" "section" "subsection"]]}
                  {:id 105
                   :template  "The next chapter [{1}] the question of ..."
                   :choices [["looks at" "examines" "investigates"]]}
                  {:id 106
                   :template  "[{1}] regarding X are discussed in later sections."
                   :choices [["Problems" "Questions" "Issues"]]}
                  {:id 107
                   :template  "A discussion of X [{1}] outside the scope of this paper."
                   :choices [["is" "falls"]]}
                  {:id 108
                   :template  "For reasons of space, X is not [{1}] in this paper."
                   :choices [["addressed" "dealt with" "considered"]]}]}
   :cat9 {:title "Giving general panorama of past-to-present literature"
          :items [
                  {:id 109
                   :template  "There is a [{1}] amount of literature on ..."
                   :choices [["considerable" "vast"]]}
                  {:id 110
                   :template  "In the literature there are [{1}] few examples of ..."
                   :choices [["many" "several" "a surprising number of"]]}
                  {:id 111
                   :template  "What [{1}] about X is largely based on ..."
                   :choices [["we know" "is known"]]}
                  {:id 112
                   :template  "[{1}] is known about ..."
                   :choices [["Much" "Not much" "Very little"]]}
                  {:id 113
                   :template  "[{1}] studies have been published on ... [Ref]"
                   :choices [["Many" "Few"]]}
                  {:id 114
                   :template  "Various approaches have been [{1}] to solve this issue [Ref]."
                   :choices [["proposed" "put forward" "suggested" "hypothesized"]]}
                  {:id 115
                   :template  "X has been [{1}] as being ... [Ref]"
                   :choices [["identified" "indicated"]]}
                  {:id 116
                   :template  "X has been [{1}] to be ... [Ref]"
                   :choices [["shown" "demonstrated" "proved" "found"]]}
                  {:id 117
                   :template  "X has been widely [{1}] ... [Ref]"
                   :choices [["investigated" "studied" "addressed"]]}
                  {:id 118
                   :template  "Xs have been [{1}] much attention due to ..."
                   :choices [["receiving" "gaining"]]}
                  {:id 119
                   :template  "In the [{1}] approach, X is used to ..."
                   :choices [["traditional" "classical"]]}
                  {:id 120
                   :template  "In recent years there has been [{1}] interest in ... [Ref]"
                   :choices [["considerable" "growing"]]}
                  {:id 121
                   :template  "A growing body of literature has [{1}] ... [Ref]"
                   :choices [["examined" "investigated" "studied" "analyzed" "evaluated"]]}
                  {:id 122
                   :template  "Much work on the potential of X has been carried out [Ref], [{1}] there are still somecritical issues ... [Ref]"
                   :choices [["yet" "however"]]}]}
   :cat10 {:title "Reviewing past literature"
           :items [
                   {:id 123
                    :template  "In their [{1}] paper of 2042, Marvin and Arthur ..."
                    :choices [["seminal" "groundbreaking" "cutting edge"]]}
                   {:id 124
                    :template  "[{1}] work in this field focused primarily on ..."
                    :choices [["Initial" "Preliminary"]]}
                   {:id 125
                    :template  "Some preliminary work was carried out [{1}] ..."
                    :choices [["in the early 1942s" "several years ago"]]}
                   {:id 126
                    :template  "Marvin in 2042 was [{1}] the first to ..."
                    :choices [["among" "one of"]]}
                   {:id 127
                    :template  "The first [{1}] X found that ..."
                    :choices [["investigations into" "studies on"]]}
                   {:id 128
                    :template  "The first systematic [{1}] on X was [{2}] in 1942 by ..."
                    :choices [["study" "report"] ["carried out" "conducted" "performed"]]}
                   {:id 129
                    :template  "An increase in X was first [{1}] by ..."
                    :choices [["noted" "reported" "found"]]}]}
   :cat11 {:title "Reviewing subsequent and more recent literature"
           :items [
                   {:id 130
                    :template  "Experiments on X were [{1}] on X in 2009 by a group of researchers from ..."
                    :choices [["conducted" "carried out" "performed"]]}
                   {:id 131
                    :template  "In a major advance in 2010, Marvin et al. [{1}] ..."
                    :choices [["surveyed" "interviewed"]]}
                   {:id 132
                    :template  "Marvin and co-workers [2011] [{1}] ..."
                    :choices [["measured" "calculated" "estimated"]]}
                   {:id 133
                    :template  "In [42] the authors [{1}] ..."
                    :choices [["investigated" "studied" "analyzed"]]}
                   {:id 134
                    :template  "A recent review of the literature on this [{1}] [2012] found that ..."
                    :choices [["topic" "subject" "matter" "area"]]}
                   {:id 135
                    :template  "[{1}] of studies have found that ..."
                    :choices [["A number" "An increasing number"]]}
                   {:id 136
                    :template  "[{1}], much more information on X has become available ..."
                    :choices [["Since 2011" "In the last few years"]]}
                   {:id 137
                    :template  "Several studies, for [{1}] [1], [2], and [6], [{2}] on X."
                    :choices [["example" "instance"] ["have been carried out" "conducted" "performed"]]}
                   {:id 138
                    :template  "More recent evidence [Marvin, 2013] [{1}] that ..."
                    :choices [["shows" "suggests" "highlights" "reveals" "proposes"]]}
                   {:id 139
                    :template  "It has now been [{1}] ... [Marvin 2010]"
                    :choices [["suggested" "hypothesized" "proposed" "shown" "demonstrated"]]}
                   {:id 140
                    :template  "Many attempts have been made [Marvin 2009, Aurthur 2010, Zaphod 2011] [{1}] ..."
                    :choices [["in order to" "with the purpose of" "aimed at"]]}]}
   :cat12 {:title "Reporting what specific authors have said"
           :items [
                   {:id 141
                    :template  "In her [{1}] of X, Marvin [2] questions the need for ..."
                    :choices [["analysis" "review" "overview" "critique"]]}
                   {:id 142
                    :template  "In his [{1}] X, Marvin [3] shows that ..."
                    :choices [["introduction to" "seminal article on" "investigation into"]]}
                   {:id 143
                    :template  "Marvin [4] [{1}] a new method for X and concluded that ..."
                    :choices [["developed" "reported on"]]}
                   {:id 144
                    :template  "Southern’s group [5] calls into question some past [{1}] about X."
                    :choices [["assumptions" "hypotheses" "theories"]]}
                   {:id 145
                    :template  "Marvin [6], an authority on X, [{1}] that ..."
                    :choices [["notes" "mentions" "highlights" "states" "affirms"]]}
                   {:id 146
                    :template  "She [{1}] whether [or not] X can ..."
                    :choices [["questions" "wonders" "considers" "investigates"]]}
                   {:id 147
                    :template  "He traces the [{1}] X"
                    :choices [["advances in" "development of" "history of" "evolution of"]]}
                   {:id 148
                    :template  "They [{1}] X."
                    :choices [["draw our attention to" "focus on"]]}
                   {:id 149
                    :template  "They [{1}] a distinction between ..."
                    :choices [["make" "draw"]]}
                   {:id 150
                    :template  "He [{1}] that ..."
                    :choices [["claims" "argues" "maintains" "suggests" "points out" "underlines"]]}
                   {:id 151
                    :template  "She [{1}] that ..."
                    :choices [["concludes" "comes to the conclusion" "reaches the conclusion"]]}
                   {:id 152
                    :template  "She [{1}] several reasons for ..."
                    :choices [["lists" "outlines" "describes" "provides"]]}
                   {:id 153
                    :template  "Her [{1}] is based on ..."
                    :choices [["theory" "solution" "proposal" "method" "approach"]]}]}
   :cat13 {:title "Mentioning positive aspects of others’ work"
           :items [
                   {:id 154
                    :template  "Marvin’s [42] use of X is [{1}]."
                    :choices [["fully justified" "very plausible" "endorsed by experience"]]}
                   {:id 155
                    :template  "Marvin’s [42] assumptions seem to be [{1}]."
                    :choices [["realistic" "well-founded" "well-grounded" "plausible" "reasonable" "acceptable"]]}
                   {:id 156
                    :template  "The equations given in [42] are [{1}] ..."
                    :choices [["accurate" "comprehensive"]]}
                   {:id 157
                    :template  "It has been suggested [42] that ... and this seems to be a [{1}] approach ..."
                    :choices [["reliable" "useful" "innovative"]]}]}
   :cat14 {:title "Highlighting limitations of previous studies - authors not mentioned by name"
           :items [
                   {:id 158
                    :template  "Research has tended to focus on X rather than Y. [{1}] X is ..."
                    :choices [["An additional problem is that" "Moreover"]]}
                   {:id 159
                    :template  "The main [{1}] of X is ..."
                    :choices [["limitation" "downside" "disadvantage" "pitfall" "shortfall"]]}
                   {:id 160
                    :template  "One of the major drawbacks to [{1}] this system is ..."
                    :choices [["adopting" "using" "exploiting"]]}
                   {:id 161
                    :template  "This is something of a [{1}] ..."
                    :choices [["pitfall" "disadvantage"]]}
                   {:id 162
                    :template  "A [{1}] criticism of X is ..."
                    :choices [["well-known" "major" "serious"]]}
                   {:id 163
                    :template  "A key problem with much of the literature [{1}] X is that ..."
                    :choices [["on" "regarding" "in relation to"]]}
                   {:id 164
                    :template  "This raises many questions [{1}] whether X should be used for ..."
                    :choices [["about" "as to" "regarding"]]}
                   {:id 165
                    :template  "One [{1}] that needs to be [{2}] is ..."
                    :choices [["question" "issue"] ["asked" "raised"]]}
                   {:id 166
                    :template  "Unfortunately, [{1}] explain why ..."
                    :choices [["it does not" "fails to" "neglects to"]]}
                   {:id 167
                    :template  "This method suffers from a [{1}] of pitfalls."
                    :choices [["number" "series" "plethora"]]}
                   {:id 168
                    :template  "There is still considerable [{1}] with regard to ..."
                    :choices [["ambiguity" "disagreement" "uncertainty"]]}
                   {:id 169
                    :template  "Many experts contend, [{1}], that this evidence is not conclusive."
                    :choices [["however" "instead" "on the other hand"]]}
                   {:id 170
                    :template  "A related hypothesis [{1}] that X is equal to Y, [{2}] that ..."
                    :choices [["holds" "maintains"] ["suggesting" "indicating"]]}
                   {:id 171
                    :template  "Other observations [{1}] that this explanation is insufficient ..."
                    :choices [["indicate" "would seem to suggest"]]}]}
   :cat15 {:title "Highlighting limitations of previous studies - authors mentioned by name"
           :items [
                   {:id 172
                    :template "Peng [31] [{1}] that X is ... but she failed to provide adequate proof of this finding."
                    :choices [["claimed" "contended"]]}
                   {:id 173
                    :template "Peng’s findings do not [{1}] to support his conclusions."
                    :choices [["seem" "appear"]]}
                   {:id 174
                    :template "This has led authors [{1}] Mithran [32], Yasmin [34] and Hai [35] to investigate ..."
                    :choices [["such as" "for example" "for instance"]]}
                   {:id 175
                    :template "The [{1}] of their method have been clearly recognized."
                    :choices [["shortcomings" "pitfalls" "flaws"]]}
                   {:id 176
                    :template "A serious [{1}] with this argument, however, is that ..."
                    :choices [["weakness" "limitation" "drawback"]]}
                   {:id 177
                    :template "Their approach is not [{1}] ..."
                    :choices [["well suited to" "appropriate for" "suitable for"]]}
                   {:id 178
                    :template "The main weakness in their study is that they [{1}] ..."
                    :choices [["make no attempt to" "offer no explanation for" "overlook"]]}
                   {:id 179
                    :template "Their experiments [{1}] by X."
                    :choices [["were marred" "flawed" "undermined"]]}
                   {:id 180
                    :template "X is the [{1}] their experiments."
                    :choices [["major flaw in" "drawback to" "disadvantage of"]]}
                   {:id 181
                    :template "The major defect in their experiments is that they entail [{1}] calculations with regard to ..."
                    :choices [["tedious" "repetitive" "time-consuming" "laborious" "labor-intensive"]]}
                   {:id 182
                    :template "Such an [{1}] can lead to [{2}] consequences with regard to ..."
                    :choices [["unreasonable" "unjustified" "inappropriate" "unsuitable" "misleading assumption"] ["serious" "grave"]]}
                   {:id 183
                    :template "Their claims seem to be somewhat [{1}] .."
                    :choices [["exaggerated" "inaccurate" "unreliable" "speculative" "superficial"]]}
                   {:id 184
                    :template "In our view, their findings are only [{1}] based on [{2}] assumptions."
                    :choices [["conjectures" "speculations"] ["unjustified" "implausible" "unsatisfactory" "ambivalent" "unsubstantiated"]]}
                   {:id 185
                    :template "Their [{1}] might have been more [{2}] ..."
                    :choices [["paper" "work" "study" "research" "approach" "findings" "results"] ["interesting" "innovative" "useful" "convincing" "persuasive if"]]}
                   {:id 186
                    :template "Their attempts to do X are [{1}] ..."
                    :choices [["cumbersome" "unnecessarily complicated" "financially unfeasible"]]}
                   {:id 187
                    :template "Their explanations are [{1}] ..."
                    :choices [["superficial" "impenetrable" "doubtful" "confusing" "misleading" "irrelevant"]]}
                   {:id 188
                    :template "[{1}] weakness is ..."
                    :choices [["Another" "An additional"]]}
                   {:id 189
                    :template "An even greater source of [{1}] is ..."
                    :choices [["concern" "issue" "problem"]]}]}
   :cat16 {:title "Using the opinions of others to justify your criticism of someone’s work"
           :items [
                   {:id 190
                    :template "As mentioned by Burgess [2011], Henri’s argument [{1}] ..."
                    :choices [["" "approach" "reasoning relies too heavily on"]]}
                   {:id 191
                    :template "As others have highlighted [34, 45, 60], Ozil’s approach [{1}] ..."
                    :choices [["raises many doubts" "is questionable"]]}
                   {:id 192
                    :template "Several [{1}] have [{2}] Guyot on the grounds that ..."
                    :choices [["authors" "experts" "researchers" "analysts"] ["expressed doubts about" "called into question" "challenged"]]}
                   {:id 193
                    :template "Marchesi [2010] has already noted an inconsistency with Hahn’s [{1}] ..."
                    :choices [["claim" "methodology" "method" "results" "approach"]]}
                   {:id 194
                    :template "Friedrich’s approach [2013] [{1}] to much criticism and has been [{2}] challenged ..."
                    :choices [["has not escaped criticism" "been subjected"] ["strongly" "vigorously"]]}
                   {:id 195
                    :template "Many experts now [{1}] that rather than using Pappov’s approach it might be more useful to ..."
                    :choices [["contend" "believe" "argue"]]}
                   {:id 196
                    :template "Their analysis has not [{1}] general acceptance ..."
                    :choices [["found" "met with" "received"]]}
                   {:id 197
                    :template "Some recent [{1}] Kim’s work are summarized in [25]."
                    :choices [["criticisms of" "critical comments on"]]}
                   {:id 198
                    :template "The most well-known critic of Sadie’s findings is ... who [{1}] that an alternative explanation [{2}] ..."
                    :choices [["argued" "proposed" "suggested"] ["might be that" "could be found in"]]}]}
   :cat17 {:title "Describing purpose of testing / methods used"
           :items [
                   {:id 199
                    :template "In order to [{1}] X ..."
                    :choices [["identify" "understand" "investigate" "study" "analyze"]]}
                   {:id 200
                    :template "To [{1}] us to ... , we ..."
                    :choices [["enable" "allow"]]}
                   {:id 201
                    :template "To [{1}] whether ..."
                    :choices [["see" "determine" "check" "verify" "determine"]]}
                   {:id 202
                    :template "To [{1}] for X, Y was done."
                    :choices [["control" "test"]]}
                   {:id 203
                    :template "So that we [{1}] do X, we ..."
                    :choices [["could" "would be able to"]]}
                   {:id 204
                    :template "In an [{1}] to do X, we ..."
                    :choices [["attempt" "effort"]]}
                   {:id 205
                    :template "[{1}] in order to ..."
                    :choices [["X was done" "We did X"]]}]}
   :cat18 {:title "Outlining similarities with other authors’ models, systems etc."
           :items [
                   {:id 206
                    :template "The set up we used [{1}] in [Ref 2]."
                    :choices [["can be found" "is reported" "is detailed"]]}
                   {:id 207
                    :template "Our experimental set up [{1}] the one proposed by Smith [2014]."
                    :choices [["bears a close resemblance to" "is reminiscent of" "is based on" "is a variation on" "was inspired by" "owes a lot to" "is more or less identical to" "is practically the same as"]]}
                   {:id 208
                    :template "We used a variation of Smith’s procedure. [{1}] in our procedure we ..."
                    :choices [["In fact" "Specifically,"]]}
                   {:id 209
                    :template "Our steps [{1}] indicated in [Ref. 2]. First, ..."
                    :choices [["proceed very much in the same way as" "follow what is"]]}
                   {:id 210
                    :template "The procedure used is as [{1}] by Sakamoto [2013]."
                    :choices [["described" "explained" "reported" "proposed"]]}
                   {:id 211
                    :template "The method is [{1}] that used by Kirk [2009] with some [{2}]."
                    :choices [["in line with a variation of" "essentially the same as"] ["changes" "modifications" "alterations" "adjustments"]]}
                   {:id 212
                    :template "We [{1}] the method [{2}] by Bing [2012]."
                    :choices [["refined" "altered" "adapted" "modified" "revised"] ["used" "reported" "suggested" "explained" "proposed" "put forward"]]}
                   {:id 213
                    :template "Our technique was [{1}] based on ..."
                    :choices [["loosely" "partially" "partly" "to some extent"]]}
                   {:id 214
                    :template "More details [{1}] in our previous paper [35]."
                    :choices [["can be found" "are given"]]}
                   {:id 215
                    :template "This component is fully compliant with international [{1}]."
                    :choices [["norms" "regulations" "standards"]]}]}
   :cat19 {:title "Describing the apparatus and materials used and their source"
           :items [
                   {:id 216
                    :template "The instrument [{1}] was ..."
                    :choices [["used" "utilized" "adopted" "employed"]]}
                   {:id 217
                    :template "The apparatus [{1}] ..."
                    :choices [["consists of" "is made up of" "is composed of" "is based on"]]}
                   {:id 218
                    :template "The device was [{1}] in order to ..."
                    :choices [["designed" "developed" "set up"]]}
                   {:id 219
                    :template "X [{1}] the latest technological advances."
                    :choices [["incorporates" "exploits" "makes use of"]]}
                   {:id 220
                    :template "The system [{1}] with a ..."
                    :choices [["comes complete" "is equipped" "is fully integrated" "is fitted"]]}
                   {:id 221
                    :template "It is [{1}] ..."
                    :choices [["mounted on" "connected to" "attached to" "fastened to" "fixed to" "surrounded by" "covered with" "integrated into" "embedded onto" "encased in" "housed in" "aligned with"]]}
                   {:id 222
                    :template "It is [{1}] ..."
                    :choices [["located in" "situated in" "positioned on"]]}
                   {:id 223
                    :template "X was [{1}] Big Company Inc."
                    :choices [["obtained from" "supplied by"]]}
                   {:id 224
                    :template "X was kindly [{1}] by Prof Big."
                    :choices [["provided" "supplied"]]}]}
   :cat20 {:title "Reporting software used"
           :items [
                   {:id 225
                    :template "The software [{1}] used to analyze the data was SoftGather (Softsift plc, London)."
                    :choices [["application" "program" "package"]]}
                   {:id 226
                    :template "The data were [{1}] using SoftGather."
                    :choices [["obtained" "collected"]]}
                   {:id 227
                    :template "Data [{1}] was performed [{2}] SoftGather."
                    :choices [["management" "analysis"] ["by" "using"]]}
                   {:id 228
                    :template "X was [{1}] using SoftGather."
                    :choices [["carried out" "performed" "analyzed" "calculated" "determined"]]}
                   {:id 229
                    :template "Statistical significance was analyzed [{1}] SoftGather."
                    :choices [["by using" "through the use of"]]}
                   {:id 230
                    :template "We used [{1}]."
                    :choices [["commercially available software" "a commercially available software package"]]}
                   {:id 231
                    :template "Free software, downloaded from www.free.edu, was [{1}] to ..."
                    :choices [["used" "adopted"]]}]}
   :cat21 {:title "Reporting customizations performed"
           :items [
                   {:id 232
                    :template "X was [{1}] for use with ..."
                    :choices [["tailored" "customized"]]}
                   {:id 233
                    :template "X can easily be [{1}] to suit all requirements."
                    :choices [["customized" "adapted" "modified"]]}
                   {:id 234
                    :template "Measurements were taken using [{1}] equipment."
                    :choices [["purpose-built" "custom-built" "customized"]]}
                   {:id 235
                    :template "The apparatus was adapted [{1}]:"
                    :choices [["as in [Ref]" "in accordance with [Ref]" "as follows"]]}
                   {:id 236
                    :template "The following [{1}] were made:"
                    :choices [["changes" "modifications"]]}
                   {:id 237
                    :template "The resulting ad hoc device [{1}] ..."
                    :choices [["can" "is able to" "has the capacity to"]]}]}
   :cat22 {:title "Formulating equations, theories and theorems"
           :items [
                   {:id 238
                    :template "This problem can [{1}] in terms of ..."
                    :choices [["be outlined" "phrased" "posed"]]}
                   {:id 239
                    :template "The problem is [{1}] ..."
                    :choices [["ruled by" "governed by" "related to" "correlated to"]]}
                   {:id 240
                    :template "This theorem [{1}] that ..."
                    :choices [["asserts" "states"]]}
                   {:id 241
                    :template "The [{1}] can be expressed as ..."
                    :choices [["resulting integrals" "solution to X"]]}
                   {:id 242
                    :template "... where T [{1}] time."
                    :choices [["stands for" "denotes" "identifies" "is an abbreviation for"]]}
                   {:id 243
                    :template "[{1}] into ..."
                    :choices [["By substituting" "Substituting" "Substitution"]]}
                   {:id 244
                    :template "[{1}] we have that: ..."
                    :choices [["Combining" "Integrating" "Eliminating ..."]]}
                   {:id 245
                    :template "[{1}] X, we ..."
                    :choices [["Taking advantage of" "Exploiting" "Making use of"]]}
                   {:id 246
                    :template "On combining this result with X, we [{1}] that ..."
                    :choices [["deduce" "conclude"]]}
                   {:id 247
                    :template "Subtracting X from Y, we [{1}] ..."
                    :choices [["have that" "obtain" "get"]]}
                   {:id 248
                    :template "Equation 1 [{1}] that"
                    :choices [["shows" "reveals"]]}
                   {:id 249
                    :template "This [{1}] ..."
                    :choices [["gives the formal solution" "allows a formal solution to be found"]]}
                   {:id 250
                    :template "It may [{1}] verified that ..."
                    :choices [["easily" "simply"]]}
                   {:id 251
                    :template "It is [{1}] to verify that ..."
                    :choices [["straightforward" "easy" "trivial"]]}
                   {:id 252
                    :template "For [{1}] , we"
                    :choices [["the sake of simplicity" "reasons of space"]]}]}
   :cat23 {:title "Explaining why you chose your specific method, model, equipment, sample etc."
           :items [
                   {:id 253
                    :template "[{1}] of X is to do Y. [{2}] ..."
                    :choices [["The aim" "purpose"] ["Consequently we" "As a result we" "Therefore we" "We thus"]]}
                   {:id 254
                    :template "This [{1}] was chosen because it is one of the most [{2}] ways to ..."
                    :choices [["method" "model" "system"] ["practical" "feasible" "economic" "rapid"]]}
                   {:id 255
                    :template "We chose this particular apparatus [{1}] ..."
                    :choices [["because" "on account of the fact that" "due to" "since"]]}
                   {:id 256
                    :template "It was decided that the best [{1}] for this [{2}] was to ..."
                    :choices [["procedure" "method" "equipment"] ["investigation" "study"]]}
                   {:id 257
                    :template "An X approach was [{1}] in order to ..."
                    :choices [["chosen" "selected"]]}
                   {:id 258
                    :template "The design of the X [{1}] ..."
                    :choices [["was based on" "is geared towards"]]}
                   {:id 259
                    :template "We [{1}] a small sample size [{2}]"
                    :choices [["opted for" "chose"] ["because" "due to" "on the basis of ..."]]}
                   {:id 260
                    :template "[{1}] X, we were able to ..."
                    :choices [["By having" "By exploiting" "Through the use of"]]}
                   {:id 261
                    :template "Having an X [{1}] do Y."
                    :choices [["enabled us to" "allowed us to" "meant that we could"]]}]}
   :cat24 {:title "Explaining the preparation of samples, solutions etc."
           :items [
                   {:id 262
                    :template "We used [{1}] techniques based on the recommendations of ..."
                    :choices [["reliable" "innovative" "classic" "traditional"]]}
                   {:id 263
                    :template "Xs were prepared [{1}] Jude [2010]."
                    :choices [["as described by" "according to" "following"]]}
                   {:id 264
                    :template "Xs were prepared [{1}]"
                    :choices [["in accordance with" "in compliance with" "as required by...."]]}
                   {:id 265
                    :template "Y was prepared using [{1}] procedure as for X."
                    :choices [["the same" "a similar"]]}
                   {:id 266
                    :template "All samples were [{1}] checked for ..."
                    :choices [["carefully" "thoroughly"]]}
                   {:id 267
                    :template "X was [{1}] heated"
                    :choices [["gradually" "slowly" "rapidly" "gently"]]}
                   {:id 268
                    :template "The [{1}] solutions contained ..."
                    :choices [["final" "resulting"]]}
                   {:id 269
                    :template "This was done [{1}] a calculator."
                    :choices [["by means of" "using" "with"]]}]}
   :cat25 {:title "Outlining selection procedure for samples, surveys etc."
           :items [
                   {:id 270
                    :template "The [{1}] approach to sample collection is to ..."
                    :choices [["traditional" "classical" "normal" "usual"]]}
                   {:id 271
                    :template "The [{1}] for selecting Xs were:"
                    :choices [["criteria" "reasons"]]}
                   {:id 272
                    :template "The sample was [{1}] on the basis of X and Y."
                    :choices [["selected" "subdivided"]]}
                   {:id 273
                    :template "The initial sample [{1}] ..."
                    :choices [["consisted of" "was made up" "was composed of"]]}
                   {:id 274
                    :template "[{1}] a [{2}] of the sample were ..."
                    :choices [["Approximately" "Just over" "Slightly under"] ["half" "third" "quarter"]]}
                   {:id 275
                    :template "A total of 1234 Xs were recruited for [{1}]."
                    :choices [["this study" "this survey" "for interviews"]]}
                   {:id 276
                    :template "At the beginning of the study, all of the [{1}] were aged ..."
                    :choices [["participants" "subjects" "patients"]]}
                   {:id 277
                    :template "In all cases [{1}] consent was obtained."
                    :choices [["patients’" "subjects’" "participants’"]]}
                   {:id 278
                    :template "Interviews were [{1}] informally"
                    :choices [["performed" "conducted" "carried out"]]}
                   {:id 279
                    :template "The interviewees were [{1}] into two groups [{2}] of ..."
                    :choices [["divided" "split" "broken down"] ["based on" "on the basis"]]}]}
   :cat26 {:title "Indicating the time frame (past tenses)"
           :items [
                   {:id 280
                    :template "Initial studies were [{1}] using the conditions described"
                    :choices [["made" "performed" "done" "carried out" "executed"]]}
                   {:id 281
                    :template "above [{1}] a period of ..."
                    :choices [["over" "for"]]}
                   {:id 282
                    :template "X was [{1}] during the [{2}] step."
                    :choices [["collected" "used" "tested" "characterized" "assessed"] ["first" "initial"]]}
                   {:id 283
                    :template "[{1}] X, we did Y."
                    :choices [["Prior to" "Before doing"]]}
                   {:id 284
                    :template "First we [{1}] the value of X [{2}], we [{3}] Y."
                    :choices [["estimated" "determined"] ["then" "subsequently"] ["studied" "analyzed" "evaluated"]]}
                   {:id 285
                    :template "[{1}] had been done, we then did Y."
                    :choices [["Once" "As soon as" "After X"]]}
                   {:id 286
                    :template "The levels were [{1}] set at ..."
                    :choices [["thus" "consequently" "therefore"]]}
                   {:id 287
                    :template "[{1}] X was subjected to Y."
                    :choices [["After" "Afterwards" "Following this,"]]}
                   {:id 288
                    :template "The [{1}] Xs were then ..."
                    :choices [["resulting" "remaining"]]}
                   {:id 289
                    :template "The experiment was then [{1}] under conditions in which ..."
                    :choices [["repeated" "replicated"]]}
                   {:id 290
                    :template "Finally, [{1}] tests were performed on the ..."
                    :choices [["independent" "separate" "further" "additional"]]}]}
   :cat27 {:title "Indicating the time frame in a general process (present tenses)"
           :items [
                   {:id 291
                    :template "[{1}] of the process ..."
                    :choices [["In the first step" "During the first phase" "In the initial stage"]]}
                   {:id 292
                    :template "[{1}] X has been done, we can then do Y."
                    :choices [["Once" "As soon as" "After"]]}
                   {:id 293
                    :template "[{1}] for the next step."
                    :choices [["This sets the stage" "We are now ready"]]}
                   {:id 294
                    :template "[{1}] X can be ..."
                    :choices [["At this point" "Now"]]}
                   {:id 295
                    :template "[{1}] these steps have been carried out, X ..."
                    :choices [["After" "When" "As soon as"]]}
                   {:id 296
                    :template "[{1}], we are now ready to ..."
                    :choices [["With the completion of these steps" "When these steps have been completed"]]}
                   {:id 297
                    :template "This condition cannot be reached [{1}] X has been ..."
                    :choices [["until" "unless"]]}
                   {:id 298
                    :template "[{1}] X is ready, the final adjustments can be made."
                    :choices [["When" "As soon as"]]}
                   {:id 299
                    :template "The completed X can [{1}] be used to ..."
                    :choices [["now" "then" "subsequently"]]}
                   {:id 300
                    :template "[{1}], Y can then be done."
                    :choices [["By reducing the amount of X" "If the amount of X is reduced"]]}
                   {:id 301
                    :template "[{1}] all the Xs in a container."
                    :choices [["To reduce the risk of Y, place" "The risk of X can be reduced by placing"]]}
                   {:id 302
                    :template "The experiment [{1}] following the steps outlined below."
                    :choices [["proceeds" "continues"]]}]}
   :cat28 {:title "Indicating that care must be taken"
           :items [
                   {:id 303
                    :template "To do this [{1}] doing X."
                    :choices [["entails" "involves" "requires"]]}
                   {:id 304
                    :template "It is [{1}] practical to ..."
                    :choices [["seldom" "rarely" "usually" "generally" "often" "always"]]}
                   {:id 305
                    :template "[{1}] care are must be [{2}] when ..."
                    :choices [["Considerable" "Great"] ["taken" "exercised"]]}
                   {:id 306
                    :template "[{1}] attention must be paid when ..."
                    :choices [["A great deal of" "Considerable"]]}
                   {:id 307
                    :template "Extreme caution must be [{1}] when ..."
                    :choices [["taken" "used"]]}]}
   :cat29 {:title "Describing benefits of your method, equipment etc."
           :items [
                   {:id 308
                    :template "This method represents a [{1}] alternative to ..."
                    :choices [["viable" "valuable" "useful" "groundbreaking" "innovative"]]}
                   {:id 309
                    :template "This equipment has the [{1}] to outperform all previous Xs."
                    :choices [["ability" "capacity" "potential"]]}
                   {:id 310
                    :template "This apparatus has [{1}] interesting [{2}]."
                    :choices [["several" "many"] ["features" "characteristics"]]}
                   {:id 311
                    :template "Our method has many [{1}] applications."
                    :choices [["interesting" "attractive" "beneficial" "useful" "practical" "effective" "valuable"]]}
                   {:id 312
                    :template "Of [{1}] interest is ..."
                    :choices [["particular" "major" "fundamental"]]}
                   {:id 313
                    :template "The [{1}] advantages are:"
                    :choices [["key" "basic" "chief" "crucial" "decisive" "essential" "fundamental" "important" "main" "major" "principal"]]}
                   {:id 314
                    :template "Our procedure is a clear [{1}] on current methods."
                    :choices [["improvement" "advance"]]}
                   {:id 315
                    :template "We believe this solution will [{1}] researchers to ..."
                    :choices [["aid" "assist"]]}
                   {:id 316
                    :template "This solution [{1}] previous methods by ..."
                    :choices [["improves on" "enhances" "furthers" "advances"]]}
                   {:id 317
                    :template "The [{1}] in terms of X far outweigh the disadvantages with regard to Y."
                    :choices [["benefits" "advantages"]]}]}
   :cat30 {:title "Outlining alternative approaches "
           :items [
                   {:id 318
                    :template "A less [{1}] approach is ..."
                    :choices [["lengthy" "time-consuming" "cumbersome" "costly"]]}
                   {:id 319
                    :template "A [{1}] solution for this problem ..."
                    :choices [["neater" "more elegant" "simplified" "more practical"]]}
                   {:id 320
                    :template "An alternative solution, though [{1}] is ..."
                    :choices [["with high overheads" "slightly more complicated" "less exhaustive"]]}
                   {:id 321
                    :template "[{1}] way to avoid the use of X is to use Y instead."
                    :choices [["One" "One possible" "A good"]]}]}
   :cat31 {:title "Explaining how you got your results"
           :items [
                   {:id 322
                    :template "To [{1}], Z was used."
                    :choices [["assess X" "evaluate X" "distinguish between X and Y"]]}
                   {:id 323
                    :template "X analysis was used to [{1}] Y."
                    :choices [["test" "predict" "confirm"]]}
                   {:id 324
                    :template "Changes in X were [{1}] using ..."
                    :choices [["identified" "calculated" "compared"]]}
                   {:id 325
                    :template "The [{1}] between X and Y was tested."
                    :choices [["correlation" "difference"]]}
                   {:id 326
                    :template "The first set of analyses [{1}] the impact of ..."
                    :choices [["investigated" "examined" "confirmed" "highlighted"]]}]}
   :cat32 {:title "Reporting results from questionnaires and interviews"
           :items [
                   {:id 327
                    :template "Of the [{1}], 90 subjects completed and returned the questionnaire."
                    :choices [["study population" "initial sample" "initial cohort"]]}
                   {:id 328
                    :template "The response rate was 70% [{1}] six months and ..."
                    :choices [["at" "after" "for the first"]]}
                   {:id 329
                    :template "The majority of [{1}] felt that ..."
                    :choices [["respondents" "those who responded"]]}
                   {:id 330
                    :template "[{1}] of those [{2}] reported that ..."
                    :choices [["Over half" "Sixty per cent"] ["surveyed" "questioned"]]}
                   {:id 331
                    :template "[{1}] two-thirds of the participants (64%) [{2}] that ..."
                    :choices [["Almost" "Just under" "Approximately"] ["said" "felt" "commented"]]}
                   {:id 332
                    :template "[{1}] of those interviewed [{2}] that ..."
                    :choices [["Only" "Just a small number" "Fifteen per cent"] ["reported" "suggested" "indicated"]]}
                   {:id 333
                    :template "Of the 82 subjects who [{1}], just [{2}] half replied that ..."
                    :choices [["completed the questionnaire" "took part in the survey" "agreed to participate"] ["under" "over"]]}
                   {:id 334
                    :template "[{1}] (4%) indicated ..."
                    :choices [["A small minority of" "Hardly any" "Very few participants"]]}
                   {:id 335
                    :template "In response to Question 1 [{1}] of those surveyed indicated that ..."
                    :choices [[", most" "nearly all" "the majority"]]}
                   {:id 336
                    :template "When the subjects [{1}] X the majority commented that ..."
                    :choices [["were asked about" "questioned on"]]}
                   {:id 337
                    :template "The overall response to this question was [{1}] negative."
                    :choices [["surprisingly" "unexpectedly" "very" "quite"]]}]}
   :cat33 {:title "Stating what you found"
           :items [
                   {:id 338
                    :template "These tests [{1}] that ..."
                    :choices [["revealed" "showed" "highlighted"]]}
                   {:id 339
                    :template "[{1}] of X was found ..."
                    :choices [["Strong" "Some" "No evidence"]]}
                   {:id 340
                    :template "[{1}], for high values of X, Y was found .."
                    :choices [["Interestingly" "Surprisingly" "Unexpectedly"]]}
                   {:id 341
                    :template "There was [{1}] correlation between ..."
                    :choices [["a significant positive" "no"]]}
                   {:id 342
                    :template "[{1}], we found values for X of ..."
                    :choices [["On average" "Generally speaking" "Broadly speaking"]]}
                   {:id 343
                    :template "The [{1}] score for X was ..."
                    :choices [["average" "mean"]]}
                   {:id 344
                    :template "This result is significant [{1}] at an X level."
                    :choices [["only" "exclusively"]]}
                   {:id 345
                    :template "Further [{1}] showed that ..."
                    :choices [["analysis" "analyses" "tests" "examinations" "replications"]]}]}
   :cat34 {:title "Stating what you did not find"
           :items [
                   {:id 346
                    :template "No significant [{1}] was [{2}] ..."
                    :choices [["difference" "correlation"] ["found" "identified" "revealed" "detected" "observed" "highlighted between"]]}
                   {:id 347
                    :template "There were no significant differences between X and Y [{1}]."
                    :choices [["in terms of Z" "with regard to Z" "as far as Z is concerned"]]}
                   {:id 348
                    :template "The analysis did not [{1}] any significant differences between ..."
                    :choices [["show" "reveal" "identify" "confirm"]]}
                   {:id 349
                    :template "[{1}] statistically significant."
                    :choices [["None of these differences were" "Not one of these differences was"]]}
                   {:id 350
                    :template "[{1}], our results show X did not affect Y."
                    :choices [["Overall" "Taken as a whole" "Generally speaking" "With a few exceptions"]]}]}
   :cat35 {:title "Highlighting significant results and achievements"
           :items [
                   {:id 351
                    :template "The most [{1}] result to emerge from the data is that ..."
                    :choices [["striking" "remarkable"]]}
                   {:id 352
                    :template "[{1}], this correlation is related to ...."
                    :choices [["Interestingly" "Curiously" "Remarkably" "Inexplicably"]]}
                   {:id 353
                    :template "[{1}] X is ..."
                    :choices [["Significantly" "Importantly" "Crucially" "Critically,"]]}
                   {:id 354
                    :template "The correlation between X and Y is [{1}] because ..."
                    :choices [["interesting" "of interest" "worth noting" "noteworthy" "worth mentioning"]]}
                   {:id 355
                    :template "The most [{1}] correlation is with the ..."
                    :choices [["surprising" "remarkable" "intriguing"]]}
                   {:id 356
                    :template "The single most [{1}] observation to emerge from the data comparison was ..."
                    :choices [["striking" "conspicuous" "marked"]]}
                   {:id 357
                    :template "It is [{1}] to note that ..."
                    :choices [["interesting" "critical" "crucial" "important" "fundamental"]]}
                   {:id 358
                    :template "[{1}] this is the first time that X ..."
                    :choices [["We believe that" "As far as we know" "As far as we aware"]]}
                   {:id 359
                    :template "[{1}] the result emphasizes the validity of our model."
                    :choices [["We believe that" "We are of the opinion that" "In our view"]]}
                   {:id 360
                    :template "This result has further strengthened our [{1}] ..."
                    :choices [["confidence in X" "conviction that X is" "hypothesis that X is"]]}
                   {:id 361
                    :template "Our technique [{1}] advantage over ..."
                    :choices [["shows a clear" "clearly has an"]]}
                   {:id 362
                    :template "The importance of X cannot be [{1}] too much."
                    :choices [["stressed" "emphasized"]]}
                   {:id 363
                    :template "This [{1}] just how important X is."
                    :choices [["underlines" "highlights" "stresses" "proves" "demonstrates"]]}
                   {:id 364
                    :template "The utility of X is thus [{1}]."
                    :choices [["underlined" "highlighted" "stressed" "proved" "demonstrated"]]}
                   {:id 365
                    :template "This finding [{1}] the usefulness of X as a ..."
                    :choices [["confirms" "points to" "highlights" "reinforces" "validates"]]}
                   {:id 366
                    :template "Our study provides [{1}] X."
                    :choices [["additional support for" "further evidence for" "considerable insight into"]]}
                   {:id 367
                    :template "These results [{1}] our knowledge of X."
                    :choices [["extend" "further" "widen"]]}
                   {:id 368
                    :template "These results offer [{1}] evidence for ..."
                    :choices [["compelling" "indisputable" "crucial" "overwhelming" "powerful" "invaluable" "unprecedented" "unique" "vital"]]}]}
   :cat36 {:title "Stating that your results confirm previous evidence"
           :items [
                   {:id 369
                    :template "Our experiments [{1}] previous results [Wiley 2009]."
                    :choices [["confirm" "corroborate" "are in line with" "are consistent with"]]}
                   {:id 370
                    :template "The values are [{1}] distinguishable from [Li 2010] who ..."
                    :choices [["barely" "scarcely" "hardly"]]}
                   {:id 371
                    :template "This value [{1}] typical of X."
                    :choices [["has been found to be" "is"]]}
                   {:id 372
                    :template "This is [{1}] with ..."
                    :choices [["in good agreement" "in complete agreement" "consistent"]]}
                   {:id 373
                    :template "This [{1}] 65] and also confirms our [{2}] findings [39, 40, 41]."
                    :choices [["fits" "matches" "concurs well with ["] ["earlier" "previous"]]}
                   {:id 374
                    :template "This [{1}] previous findings in the literature ..."
                    :choices [["confirms" "supports" "lends support to" "substantiates"]]}
                   {:id 375
                    :template "These values correlate [{1}] with Svenson [2009] and further support the [{2}] of ..."
                    :choices [["favorably" "satisfactorily" "fairly well"] ["idea" "role" "concept"]]}
                   {:id 376
                    :template "Further tests carried out with X [{1}] our initial findings."
                    :choices [["confirmed" "corroborated" "concurred with"]]}
                   {:id 377
                    :template "As [{1}] by Dong [2011], the evidence we found points to ..."
                    :choices [["proposed" "suggested" "reported" "indicated" "put forward"]]}
                   {:id 378
                    :template "Our results [{1}] a number of similarities with Claire et al.’s [2012] findings ..."
                    :choices [["share" "have"]]}]}
   :cat37 {:title "Stating that your results are in contrast with previous evidence"
           :items [
                   {:id 379
                    :template "It was found that X = 2 [{1}], Kamatchi [2011] found that ..."
                    :choices [["whereas" "on the other hand"]]}
                   {:id 380
                    :template "We found much higher values for X [{1}] those reported by Pandey [2000]."
                    :choices [["than" "with respect to"]]}
                   {:id 381
                    :template "[{1}] Li and Mithran [2014] found that X = 2 we found that X = 3."
                    :choices [["Although" "Despite the fact that"]]}
                   {:id 382
                    :template "In [{1}] earlier findings [Castenas, 2009], we ..."
                    :choices [["contrast to" "contradiction with"]]}
                   {:id 383
                    :template "This study has not confirmed previous research on X. [{1}], it serves to ..."
                    :choices [["However" "Nevertheless" "Despite this"]]}
                   {:id 384
                    :template "Even though these results differ from [{1}] studies (Cossu, 2001; Triana, 2002), they are consistent with those of ..."
                    :choices [["some published" "previous" "earlier"]]}
                   {:id 385
                    :template "Kosov et al. noted that x = y. Our results do not [{1}] their observation, in fact ..."
                    :choices [["support" "appear to corroborate" "seem to confirm"]]}
                   {:id 386
                    :template "Georgiev is correct [{1}] that x = y. However, his calculation only referred to the limited case of ... and our conclusion of x = z, would thus seem to be [{2}]."
                    :choices [["to argue" "propose" "claim"] ["justified" "justifiable" "defensible" "correct" "acceptable" "warranted"]]}
                   {:id 387
                    :template "Although our results differ [{1}] from those of Minhaz [2001],"
                    :choices [["slightly" "to some extent" "considerably"]]}
                   {:id 388
                    :template "Erturk [2007], and Hayk [2014], it [{1}] nevertheless be argued that ..."
                    :choices [["can" "could"]]}
                   {:id 389
                    :template "[{1}] not support previous research in this area. In fact, [{2}] what was previously thought, we found that ..."
                    :choices [["Our findings do" "The current study does"] ["contrary to" "unlike" "in contrast with"]]}
                   {:id 390
                    :template "These findings [{1}] previous results reported in the literature."
                    :choices [["refute" "disprove" "are in contradiction with" "contrast with" "significantly differ from"]]}]}
   :cat38 {:title "Stating and justifying the acceptability of your results"
           :items [
                   {:id 391
                    :template "As [{1}], our experiments [{2}] that ..."
                    :choices [["expected" "anticipated" "predicted" "forecast" "hypothesized"] ["show" "demonstrate" "prove"]]}
                   {:id 392
                    :template "Our formula [{1}] the response of ..."
                    :choices [["captures" "reproduces"]]}
                   {:id 393
                    :template "Apart from this slight [{1}], the result is confirmation of ..."
                    :choices [["discordance" "discrepancy" "disagreement" "non-alignment"]]}
                   {:id 394
                    :template "[{1}] the lack of agreement, we believe our findings compare well with ..."
                    :choices [["Despite" "Notwithstanding"]]}
                   {:id 395
                    :template "[{1}] there was some inconsistency ..."
                    :choices [["Although" "Even though" "Despite the fact that"]]}
                   {:id 396
                    :template "There is [{1}] agreement between ..."
                    :choices [["satisfactory" "good" "exceptional" "perfect"]]}
                   {:id 397
                    :template "No [{1}] differences were found ..."
                    :choices [["significant" "substantial" "appreciable" "noteworthy"]]}
                   {:id 398
                    :template "Our findings appear to be well [{1}] by ..."
                    :choices [["substantiated" "supported"]]}
                   {:id 399
                    :template "The number of Xs that confirmed our findings was [{1}]."
                    :choices [["appreciable" "significant" "substantial"]]}]}
   :cat39 {:title "Expressing caution regarding the interpretation of results"
           :items [
                   {:id 400
                    :template "Initially we thought that x was equal to y. However [{1}], revealed that ..."
                    :choices [["a more careful analysis" "closer inspection"]]}
                   {:id 401
                    :template "These [{1}] thus need to be interpreted with [{2}]."
                    :choices [["results" "data" "findings"] ["caution" "care" "attention"]]}
                   {:id 402
                    :template "The conclusions of the review should be [{1}] with caution."
                    :choices [["treated" "interpreted" "analyzed" "read"]]}
                   {:id 403
                    :template "However [{1}] must be [{2}] in ..."
                    :choices [[", due care" "careful attention" "extreme caution"] ["exercised" "paid"]]}
                   {:id 404
                    :template "Given that our findings are based on a limited number of Xs, the results from such analyses should [{1}] be treated with [{2}] caution."
                    :choices [["thus" "consequently" "therefore"] ["considerable" "the utmost"]]}
                   {:id 405
                    :template "[{1}] a note of caution with regard to such findings."
                    :choices [["Other researchers have sounded" "We should sound"]]}]}
   :cat40 {:title "Outlining undesired or unexpected results"
           :items [
                   {:id 406
                    :template "As [{1}] expected, our findings were often contradictory ..."
                    :choices [["was" "might have been"]]}
                   {:id 407
                    :template "[{1}], we did not find a significant difference between ..."
                    :choices [["Contrary to expectations" "Unlike other research carried out in this area"]]}
                   {:id 408
                    :template "Our results were [{1}]. However, ..."
                    :choices [["disappointing" "poor" "inadequate" "unsatisfactory" "below expectations"]]}
                   {:id 409
                    :template "Our study [{1}] in proving that ..."
                    :choices [["was unsuccessful" "not successful"]]}
                   {:id 410
                    :template "Our research [{1}] the low values of ..."
                    :choices [["failed to account for" "justify" "explain" "give an explanation for" "give a reason for"]]}
                   {:id 411
                    :template "[{1}], no [{2}] found."
                    :choices [["Surprisingly" "Unfortunately" "Disappointingly" "Regrettably"] ["signs of X were" "evidence for X was"]]}
                   {:id 412
                    :template "What [{1}] is the fact that ..."
                    :choices [["is surprising" "we were surprised to find" "we are unable to account for"]]}
                   {:id 413
                    :template "A [{1}] disagreement is evident."
                    :choices [["substantial" "appreciable" "noticeable"]]}
                   {:id 414
                    :template "The Xs appear to be [{1}] ..."
                    :choices [["over-predicted" "overestimated" "overstated"]]}
                   {:id 415
                    :template "This number is slightly lower than the value we [{1}] and there is certainly room for improvement."
                    :choices [["expected" "anticipated" "predicted"]]}]}
   :cat41 {:title "Admitting limitations"
           :items [
                   {:id 416
                    :template "We aware that our research may have two limitations. The first is ... The second is ... These limitations [{1}] the difficulty of collecting data on ...."
                    :choices [["highlight" "reveal" "underline" "are evidence of"]]}
                   {:id 417
                    :template "It is plausible that a number of limitations [{1}] influenced the results obtained."
                    :choices [["may" "might" "could have"]]}
                   {:id 418
                    :template "[{1}] possible source of error is ..."
                    :choices [["First" "To begin with ... An additional" "Another"]]}
                   {:id 419
                    :template "[{1}] the focus of the study was on X ... [{2}] that dissimilar evaluations would have arisen if the focus had been on Y."
                    :choices [["Since" "Given that" "As"] ["there is a possibility" "there is some likelihood" "it is not inconceivable"]]}
                   {:id 420
                    :template "The restricted use of X [{1}] ..."
                    :choices [["could account for" "be the reason for" "explain why"]]}
                   {:id 421
                    :template "There are several [{1}] possible error."
                    :choices [["sources for" "causes of" "reasons for"]]}
                   {:id 422
                    :template "A major source of [{1}] is in the method used to ..."
                    :choices [["unreliability" "uncertainty" "contamination"]]}
                   {:id 423
                    :template "Unfortunately [{1}], to investigate the significant relationships of X and Y further [{2}] Z is ..."
                    :choices [["it was not possible" "we were unable"] ["because" "due to the fact that"]]}
                   {:id 424
                    :template "[{1}], there were some [{2}] due to ..."
                    :choices [["Inevitably" "Not surprisingly" "As expected" "As anticipated"] ["discrepancies" "inaccuracies" "problems"]]}
                   {:id 425
                    :template "The performance was [{1}] disappointing. This was probably as a result of ..."
                    :choices [["rather" "slightly" "a little"]]}
                   {:id 426
                    :template "One [{1}] regarding our methodology is that ..."
                    :choices [["downside" "disadvantage" "negative factor"]]}
                   {:id 427
                    :template "Further data collection [{1}] to determine exactly how X affects Y."
                    :choices [["is required" "would be needed"]]}]}
   :cat42 {:title "Explaining and justifying undesired or unexpected results"
           :items [
                   {:id 428
                    :template "It is [{1}] that participants may have erroneously ... and this may have [{2}] changes in ..."
                    :choices [["very likely" "probable" "possible"] ["led to" "brought about"]]}
                   {:id 429
                    :template "The [{1}] cause of the discrepancy is [{2}] X."
                    :choices [["prime" "primary" "foremost"] ["due to" "a result of" "a consequence of"]]}
                   {:id 430
                    :template "This apparent lack of correlation can be [{1}] ..."
                    :choices [["attributed to" "explained by" "justified by"]]}
                   {:id 431
                    :template "The reason for this rather contradictory result is still not [{1}] clear, but ..."
                    :choices [["entirely" "completely"]]}
                   {:id 432
                    :template "There are several possible explanations for this [{1}]."
                    :choices [["result" "finding" "outcome"]]}
                   {:id 433
                    :template "These differences can be [{1}] in part by ..."
                    :choices [["explained" "justified" "accounted for"]]}
                   {:id 434
                    :template "It can thus be [{1}] that ..."
                    :choices [["suggested" "conceivably hypothesized" "reasonably assumed"]]}
                   {:id 435
                    :template "The unexpectedly [{1}] level of X is [{2}] due to ..."
                    :choices [["high" "low"] ["undoubtedly" "certainly" "without any doubt"]]}
                   {:id 436
                    :template "A [{1}] explanation for X may be that ...."
                    :choices [["possible" "reasonable" "satisfactory"]]}
                   {:id 437
                    :template "Another possible [{1}] for this is that ..."
                    :choices [["explanation" "rationalization" "reason"]]}
                   {:id 438
                    :template "[{1}] there may be other possible explanations."
                    :choices [["Clearly" "Evidently" "Naturally"]]}
                   {:id 439
                    :template "This [{1}] because we had not examined X [{2}] due to ..."
                    :choices [["happened" "occurred" "may have happened" "may have occurred"] ["sufficiently" "in enough depth"]]}
                   {:id 440
                    :template "The reasons for this result are not yet [{1}] understood."
                    :choices [["wholly" "completely" "entirely"]]}
                   {:id 441
                    :template "It cannot be [{1}] that there was some unintended bias in ..."
                    :choices [["ruled out" "ignored"]]}
                   {:id 442
                    :template "An unintended bias [{1}]"
                    :choices [["cannot be ruled out" "should be taken into consideration."]]}
                   {:id 443
                    :template "We cannot rule out that X [{1}] have influenced Y."
                    :choices [["might" "may"]]}
                   {:id 444
                    :template "The observed increase in X could [{1}] being a result of ..."
                    :choices [["be attributed to" "might be explained by it" "could be interpreted as"]]}
                   {:id 445
                    :template "[{1}] X was expected to do Y, it was not predicted that X would also do Z."
                    :choices [["Despite the fact that" "Although"]]}
                   {:id 446
                    :template "However, this is not particularly surprising [{1}] that ..."
                    :choices [["given the fact" "in light of the fact" "if we consider"]]}]}
   :cat43 {:title "Minimizing undesired or unexpected results"
           :items [
                   {:id 447
                    :template "Although performance was not [{1}], we [{2}] believe that ..."
                    :choices [["ideal" "perfect" "optimal"] ["still" "nevertheless"]]}
                   {:id 448
                    :template "This poor performance was not [{1}] . In fact ..."
                    :choices [["unexpected" "surprising" "very significant"]]}
                   {:id 449
                    :template "This result was not [{1}]. However, [{2}] that ..."
                    :choices [["expected" "predicted" "anticipated"] ["the reason for this is probably" "it is likely that the reason for this is" "it is probable that the reason for this is"]]}
                   {:id 450
                    :template "Our investigations so far have only been [{1}] ..."
                    :choices [["on a small scale" "applied to"]]}
                   {:id 451
                    :template "These discrepancies [{1}] due to the fact that ..."
                    :choices [["are negligible" "can be neglected" "considered as insignificant" "are of no real consequence"]]}
                   {:id 452
                    :template "Despite the limitations of this method, and consequently the poor results in Test 2, our findings do [{1}] suggest that ..."
                    :choices [["nevertheless" "in any case" "however"]]}
                   {:id 453
                    :template "[{1}] this was only a preliminary attempt to do X it is hardly surprising that ..."
                    :choices [["Given that" "Since" "On account of the fact that"]]}
                   {:id 454
                    :template "As is well known, Xs are extremely [{1}] to control, [{2}] ..."
                    :choices [["hard" "difficult" "problematic" "time-consuming" "cumbersome"] ["so" "thus" "consequently"]]}
                   {:id 455
                    :template "In fact, X was [{1}]."
                    :choices [["beyond the scope of this study" "not a primary goal in this research" "not the focus of this study" "not attempted in this study"]]}
                   {:id 456
                    :template "Consequently, it is [{1}] ..."
                    :choices [["inevitable" "understandable" "not hard to appreciate" "not surprising that"]]}
                   {:id 457
                    :template "[{1}] that ..."
                    :choices [["Note" "It should be noted" "It is worthwhile noting"]]}
                   {:id 458
                    :template "[{1}] limitation of our research is that the surveys were not conducted in the same period."
                    :choices [["A" "One"]]}
                   {:id 459
                    :template "[{1}], we can still state that ..."
                    :choices [["However" "Nevertheless" "Despite this"]]}
                   {:id 460
                    :template "We [{1}] to find a link between x and y, but this [{2}] depend on the methodology chosen for our research."
                    :choices [["failed" "were not able" "were unable"] ["may" "might"]]}]}
   :cat44 {:title "Expressing opinions and probabilities"
           :items [
                   {:id 461
                    :template "[{1}] no other authors have found that x = y."
                    :choices [["To the best of our knowledge" "As far as we know" "We believe that"]]}
                   {:id 462
                    :template "It would [{1}] that ..."
                    :choices [["seem" "appear"]]}
                   {:id 463
                    :template "Our findings would seem to [{1}] that x = y."
                    :choices [["show" "demonstrate" "suggest" "imply"]]}
                   {:id 464
                    :template "This factor [{1}] for this result."
                    :choices [["may be responsible" "is probably responsible" "could well be responsible"]]}
                   {:id 465
                    :template "[{1}] that this factor is ..."
                    :choices [["Presumably" "We hypothesize" "I argue"]]}
                   {:id 466
                    :template "We believe that our method could [{1}] in ..."
                    :choices [["be used" "probably be usefully employed"]]}
                   {:id 467
                    :template "Our approach [{1}] ..."
                    :choices [["would lend itself well for use by" "may be useful for"]]}
                   {:id 468
                    :template "In our [{1}], this method could be used in ..."
                    :choices [["opinion" "view"]]}
                   {:id 469
                    :template "We [{1}] that ..."
                    :choices [["believe" "feel strongly"]]}
                   {:id 470
                    :template "There is evidence to [{1}] the hypothesis that ..."
                    :choices [["suggest" "support"]]}
                   {:id 471
                    :template "[{1}] that ..."
                    :choices [["It is proposed" "This may mean" "It seems likely" "It may be assumed"]]}
                   {:id 472
                    :template "This [{1}] that ..."
                    :choices [["implies" "suggests" "would appear to indicate"]]}
                   {:id 473
                    :template "The results point to the [{1}] that ..."
                    :choices [["likelihood" "probability"]]}
                   {:id 474
                    :template "There is a [{1}] probability that ..."
                    :choices [["strong" "definite" "clear" "good"]]}]}
   :cat45 {:title "Announcing your conclusions and summarizing content"
           :items [
                   {:id 475
                    :template "[{1}], our work ..."
                    :choices [["In conclusion" "In summary" "In sum" "To sum up"]]}
                   {:id 476
                    :template "Our work has led us to [{1}] that ..."
                    :choices [["conclude" "the conclusion"]]}
                   {:id 477
                    :template "We have [{1}] ..."
                    :choices [["presented" "outlined" "described"]]}
                   {:id 478
                    :template "In this [{1}] we have ..."
                    :choices [["paper" "study" "review"]]}
                   {:id 479
                    :template "This paper has [{1}] ..."
                    :choices [["investigated" "explained" "given an account of"]]}]}
   :cat46 {:title "Restating the results"
           :items [
                   {:id 480
                    :template "The evidence from this study [{1}] that ..."
                    :choices [["suggests" "implies" "points towards the idea" "intimates"]]}
                   {:id 481
                    :template "The [{1}] of this study [{2}] that ..."
                    :choices [["results" "findings"] ["indicate" "support the idea" "suggest"]]}
                   {:id 482
                    :template "[{1}], these results [{2}] that ..."
                    :choices [["In general" "Taken together"] ["suggest" "would seem to suggest"]]}
                   {:id 483
                    :template "[{1}] of this is the possibility that ..."
                    :choices [["An implication" "A consequence" "The upshot"]]}]}
   :cat47 {:title "Highlighting achievements"
           :items [
                   {:id 484
                    :template "[{1}] has [{2}] the importance of ..."
                    :choices [["Our research" "This paper"] ["highlighted" "stressed" "underlined"]]}
                   {:id 485
                    :template "We have [{1}] X."
                    :choices [["managed to do" "succeeded in doing" "been able to do" "found a way to do"]]}
                   {:id 486
                    :template "We have found [{1}] solution for ..."
                    :choices [["an innovative" "a new" "a novel" "a cutting-edge"]]}
                   {:id 487
                    :template "We have obtained [{1}] results [{2}] that ..."
                    :choices [["accurate" "satisfactory" "comprehensive"] ["proving" "demonstrating" "showing"]]}
                   {:id 488
                    :template "We have devised a [{1}] which ..."
                    :choices [["methodology" "procedure" "strategy"]]}
                   {:id 489
                    :template "We have [{1}] that ..."
                    :choices [["confirmed" "provided further evidence" "demonstrated"]]}
                   {:id 490
                    :template "Considerable [{1}] with regard to ..."
                    :choices [["progress has been made" "insight has been gained"]]}
                   {:id 491
                    :template "Taken together, these findings [{1}] a role for X"
                    :choices [["suggest" "implicate" "highlight"]]}
                   {:id 492
                    :template "Our study provides [{1}] for a new way to do X."
                    :choices [["the framework" "a springboard" "the backbone" "the basis" "a blueprint" "an agenda" "a stimulus" "encouragement"]]}
                   {:id 493
                    :template "The [{1}] of our [{2}] lies in ..."
                    :choices [["strength" "strong point" "value" "impact" "benefit" "usefulness" "significance" "importance"] ["work" "study" "contribution"]]}
                   {:id 494
                    :template "X provides a powerful [{1}] for ..."
                    :choices [["tool" "methodology"]]}
                   {:id 495
                    :template "X [{1}] that X will do Y, and it can be generalized to ..."
                    :choices [["ensures" "guarantees"]]}
                   {:id 496
                    :template "Our investigations into this area are [{1}] and seem likely to confirm our hypothesis."
                    :choices [["still ongoing" "in progress"]]}
                   {:id 497
                    :template "These findings add [{1}] X."
                    :choices [["to a growing body of literature on" "substantially to our understanding of"]]}]}
   :cat48 {:title "Highlighting limitations"
           :items [
                   {:id 498
                    :template "Our work clearly has some limitations. [{1}] we believe our work could be [{2}]"
                    :choices [["Nevertheless" "Despite this"] ["the basis" "a framework" "a starting point" "a springboard for"]]}
                   {:id 499
                    :template "[{1}] there are limitations due to Y, we ..."
                    :choices [["Despite the fact that there are" "In spite of the fact that" "Although"]]}
                   {:id 500
                    :template "The most important limitation [{1}] the fact that ..."
                    :choices [["lies in" "is due to" "is a result of"]]}
                   {:id 501
                    :template "The current study was [{1}]"
                    :choices [["limited by" "unable to" "not specifically designed to..."]]}
                   {:id 502
                    :template "The present study has only [{1}] X. [{2}] ..."
                    :choices [["investigated" "examined"] ["Therefore" "Consequently"]]}
                   {:id 503
                    :template "The [{1}] was limited in several ways. First, ..."
                    :choices [["project" "analysis" "testing" "sampling"]]}
                   {:id 504
                    :template "Finally, a number of potential [{1}] need to be considered. First, ..."
                    :choices [["limitations" "weaknesses" "shortfalls" "shortcomings" "weak points"]]}
                   {:id 505
                    :template "However, given the small sample size, caution must be [{1}]."
                    :choices [["exercised" "taken" "used" "applied"]]}
                   {:id 506
                    :template "The findings might not be [{1}] ..."
                    :choices [["transferable to" "generalized to" "representative of"]]}
                   {:id 507
                    :template "The [{1}] is thus still incomplete."
                    :choices [["picture" "situation"]]}]}
   :cat49 {:title "Outlining possible applications and implications of your work"
           :items [
                   {:id 508
                    :template "This study [{1}] towards enhancing our understanding of ..."
                    :choices [["is the first step" "has gone some way"]]}
                   {:id 509
                    :template "These observations have [{1}] for research into ..."
                    :choices [["several" "three main" "many implications"]]}
                   {:id 510
                    :template "This work has [{1}] that ..."
                    :choices [["revealed" "shown" "highlighted" "demonstrated" "proved"]]}
                   {:id 511
                    :template "The present findings [{1}] in order to solve this problem."
                    :choices [["might help to solve" "have important implications for solving" "suggest several courses of action"]]}
                   {:id 512
                    :template "X [{1}]"
                    :choices [["is suitable for" "has the potential to ..."]]}
                   {:id 513
                    :template "Our [{1}] could be applied to ..."
                    :choices [["method" "technique" "approach" "procedure"]]}
                   {:id 514
                    :template "One [{1}] application of our technique would be ..."
                    :choices [["possible" "potential" "promising"]]}
                   {:id 515
                    :template "Results so far have been very [{1}] and ..."
                    :choices [["promising" "encouraging"]]}
                   {:id 516
                    :template "This approach has the [{1}] to ..."
                    :choices [["potential" "requirements" "characteristics" "features"]]}
                   {:id 517
                    :template "This could [{1}] lead to ..."
                    :choices [["eventually" "conceivably" "potentially" "hypothetically"]]}
                   {:id 518
                    :template "Our data suggest that X could be [{1}] in order to ..."
                    :choices [["used" "exploited" "taken advantage of" "made use of"]]}
                   {:id 519
                    :template "In our view these results [{1}] an excellent initial step toward ..."
                    :choices [["are" "constitute" "represent"]]}
                   {:id 520
                    :template "We [{1}] that our results may improve knowledge about ..."
                    :choices [["believe" "are confident"]]}
                   {:id 521
                    :template "These early successes may hope to [{1}]"
                    :choices [["resolve" "tackle" "solve" "deal with ..."]]}
                   {:id 522
                    :template "[{1}] implication is ..."
                    :choices [["Another" "An additional" "A further important"]]}
                   {:id 523
                    :template "Our research could [{1}] decision makers because ..."
                    :choices [["help" "be a useful aid for" "possibly support"]]}
                   {:id 524
                    :template "We think that our findings [{1}] be useful for ..."
                    :choices [["could" "might"]]}
                   {:id 525
                    :template "We hope that our research will be [{1}] in solving the"
                    :choices [["helpful" "useful" "beneficial" "constructive" "valuable"]]}
                   {:id 526
                    :template "difficulty of ... [{1}] we believe that ..."
                    :choices [["At the same time" "In addition" "Further" "Furthermore"]]}
                   {:id 527
                    :template "Our research suggests that [{1}] stakeholders to ..."
                    :choices [["the policy makers should encourage" "it is important for policy makers to encourage"]]}
                   {:id 528
                    :template "The findings of my research have [{1}] managerial implications."
                    :choices [["serious" "considerable" "important"]]}]}
   :cat50 {:title "Future work already underway or planned by the authors"
           :items [
                   {:id 529
                    :template "We are [{1}] of investigating ..."
                    :choices [["currently" "now" "in the process"]]}
                   {:id 530
                    :template "Research into solving this problem is [{1}]."
                    :choices [["already underway" "in progress"]]}
                   {:id 531
                    :template "To further our research [{1}] to ..."
                    :choices [["we plan" "are planning" "intend"]]}
                   {:id 532
                    :template "Future work will [{1}] ..."
                    :choices [["concentrate on" "focus on" "explore" "investigate" "look into"]]}
                   {:id 533
                    :template "Further studies, which take X into account, will need to be [{1}]."
                    :choices [["undertaken" "performed"]]}
                   {:id 534
                    :template "We hope that further tests will [{1}]."
                    :choices [["prove our theory" "confirm our findings"]]}
                   {:id 535
                    :template "These topics are [{1}] future work."
                    :choices [["reserved for" "deferred to"]]}]}
   :cat51 {:title "Future work proposed for third parties to carry out"
           :items [
                   {:id 536
                    :template "Further work needs to be [{1}] to establish whether ..."
                    :choices [["done" "carried out" "performed"]]}
                   {:id 537
                    :template "Further [{1}] are needed to estimate ..."
                    :choices [["experimental investigations" "tests" "studies"]]}
                   {:id 538
                    :template "[{1}] work on X, would help us to do Y."
                    :choices [["More" "Additional" "Further"]]}
                   {:id 539
                    :template "We [{1}] that our research will serve as a base for future studies on ..."
                    :choices [["hope" "believe" "are confident"]]}
                   {:id 540
                    :template "[{1}] that further research should be undertaken in the following areas:"
                    :choices [["It is recommended" "We recommend" "We suggest" "We propose"]]}
                   {:id 541
                    :template "[{1}] research is also needed to determine ..."
                    :choices [["More broadly" "On a wider level,"]]}
                   {:id 542
                    :template "This research has [{1}] many questions in need of further [{2}]."
                    :choices [["raised" "given rise to" "thrown up"] ["investigation" "study" "examination"]]}
                   {:id 543
                    :template "This is [{1}] for future research."
                    :choices [["an important" "a fundamental" "a vital issue"]]}
                   {:id 544
                    :template "The design and development of Xs will [{1}] us for years."
                    :choices [["challenge" "be a challenge for"]]}
                   {:id 545
                    :template "Future work should [{1}] on enhancing the quality of X."
                    :choices [["concentrate" "focus"]]}
                   {:id 546
                    :template "Future studies should [{1}] X."
                    :choices [["target" "aim at" "examine" "deal with" "address"]]}
                   {:id 547
                    :template "Future studies on the current topic are therefore [{1}] in order to [{2}] ..."
                    :choices [["required" "needed" "recommended" "suggested"] ["establish" "verify" "validate" "elucidate"]]}
                   {:id 548
                    :template "Our results are [{1}] and should be validated by a larger sample size."
                    :choices [["encouraging" "promising"]]}
                   {:id 549
                    :template "These findings suggest the following [{1}] for future research: ..."
                    :choices [["directions" "opportunities"]]}
                   {:id 550
                    :template "An important [{1}] to resolve for future studies is ..."
                    :choices [["issue" "matter" "question" "problem"]]}
                   {:id 551
                    :template "The prospect of being able to do X, serves as a continuous [{1}] to future research."
                    :choices [["incentive for" "stimulus for" "impulse for" "spur"]]}]}
   :cat52 {:title "Acknowledgements"
           :items [
                   {:id 552
                    :template "This work was [{1}] within the framework of an EU project and was partly sponsored by ..."
                    :choices [["carried out" "performed"]]}
                   {:id 553
                    :template "This research [{1}] a grant from ..."
                    :choices [["was made possible by" "benefited from"]]}
                   {:id 554
                    :template "Support was given by the Institute of X, who funded the work in [{1}] stages."
                    :choices [["all its" "its initial"]]}
                   {:id 555
                    :template "We [{1}] the following people for their support, without whose help this work would never have been possible:"
                    :choices [["thank" "would like to thank"]]}
                   {:id 556
                    :template "We gratefully acknowledge the [{1}]"
                    :choices [["help provided by Dr. X" "constructive comments of the anonymous referees."]]}
                   {:id 557
                    :template "We are [{1}] to Dr. Alvarez for ..."
                    :choices [["indebted" "particularly grateful"]]}
                   {:id 558
                    :template "We [{1}] Dr. Y for her [{2}]."
                    :choices [["thank" "are grateful to" "gratefully acknowledge"] ["help" "valuable suggestions and discussions"]]}
                   {:id 559
                    :template "[{1}] Prof. X, who gave us much valuable advice in the early stages of this work."
                    :choices [["Thanks are also due to" "The authors wish to thank"]]}
                   {:id 560
                    :template "Dr. Y [{1}] our staff during this research project."
                    :choices [["collaborated with" "worked alongside"]]}
                   {:id 561
                    :template "We also thank Prof. Lim for her [{1}]"
                    :choices [["ongoing collaboration with our department" "technical assistance in all our experimental work."]]}]}
   :cat53 {:title "Referring to tables and figures, and to their implications"
           :items [
                   {:id 562
                    :template "Table 1 [{1}] the data on X."
                    :choices [["compares" "lists" "details" "summarizes"]]}
                   {:id 563
                    :template "Table 2 [{1}] that X is ..."
                    :choices [["proves" "shows" "demonstrates" "illustrates" "highlights"]]}
                   {:id 564
                    :template "Figure 1 [{1}] the data on X."
                    :choices [["presents" "reports" "shows" "details"]]}
                   {:id 565
                    :template "Figure 3 [{1}] exactly where X meets Y."
                    :choices [["pinpoints" "indicates"]]}
                   {:id 566
                    :template "As [{1}] in Fig. 1, the value of ..."
                    :choices [["shown" "highlighted" "illustrated" "detailed" "can be seen"]]}
                   {:id 567
                    :template "The value of X is greater when Y = 2 [{1}]"
                    :choices [["(Fig. 1" "Eq. 2)"]]}
                   {:id 568
                    :template "The results on X [{1}] in Fig. 1."
                    :choices [["can be seen" "are compared" "are presented"]]}
                   {:id 569
                    :template "From the [{1}] we can [{2}] that ..."
                    :choices [["graph" "photo" "chart" "histogram"] ["see" "note"]]}
                   {:id 570
                    :template "It [{1}] Fig. 1 that ..."
                    :choices [["can be seen in" "is apparent from"]]}
                   {:id 571
                    :template "We [{1}] from Table 1 that .."
                    :choices [["observe" "note"]]}
                   {:id 572
                    :template "The graph [{1}] shows that ..."
                    :choices [["above" "below" "to the left" "to the right"]]}
                   {:id 573
                    :template "Figure 8 shows a [{1}] in ..."
                    :choices [["clear trend" "significant difference"]]}
                   {:id 574
                    :template "The table is [{1}] in several ways. First ..."
                    :choices [["revealing" "interesting"]]}]}
   :cat54 {:title "Making transitions, focusing on a new topic"
           :items [
                   {:id 575
                    :template "[{1}] at the second part ..."
                    :choices [["If we now turn to" "Turning now to" "Let us know look"]]}
                   {:id 576
                    :template "As far as [{1}] concerned ..."
                    :choices [["X is" "Xs are"]]}
                   {:id 577
                    :template "[{1}] X, it was found that ..."
                    :choices [["As regards" "Regarding" "Regarding the use of" "As for"]]}]}
   :cat55 {:title "Referring backwards and forwards in the paper"
           :items [
                   {:id 578
                    :template "As was [{1}] in the Methods, ..."
                    :choices [["mentioned" "stated" "noted" "discussed" "reported"]]}
                   {:id 579
                    :template "As reported [{1}]"
                    :choices [["above" "previously" "earlier" "before ..."]]}
                   {:id 580
                    :template "As [{1}] in the literature review ..."
                    :choices [["mentioned" "stated" "outlined"]]}
                   {:id 581
                    :template "The [{1}] X is ..."
                    :choices [["above" "afore-mentioned"]]}
                   {:id 582
                    :template "More details on this will be given [{1}]."
                    :choices [["below" "in the next section" "in the appendix"]]}
                   {:id 583
                    :template "[{1}] a list of ..."
                    :choices [["The following is" "Here follows" "Below is"]]}
                   {:id 584
                    :template "Please refer to [{1}] for...."
                    :choices [["Appendix 2" "Table 6" "the Supplementary Material"]]}]}
   :cat56 {:title "Referring back to your research aim"
           :items [
                   {:id 585
                    :template "As stated in the Introduction, our main [{1}] was to ..."
                    :choices [["aim" "objective" "target" "purpose" "goal"]]}
                   {:id 586
                    :template "As stated in the Introduction, the research [{1}] in order to ..."
                    :choices [["was conducted" "undertaken" "carried out"]]}
                   {:id 587
                    :template "[{1}] our main aim was, as mentioned in the Introduction, to ..."
                    :choices [["Given that" "Since"]]}
                   {:id 588
                    :template "Before interpreting our results, we [{1}] our main aims."
                    :choices [["remind the reader of" "would just like to restate"]]}
                   {:id 589
                    :template "Returning to the [{1}] posed at the beginning of this study, it is now possible to state that ..."
                    :choices [["hypothesis" "question"]]}]}
   :cat57 {:title "Referring outside the paper"
           :items [
                   {:id 590
                    :template "See the respective handbook [Ref] for a description of X."
                    :choices [[]]}
                   {:id 591
                    :template "For a detailed review on this topic see [Ref]."
                    :choices [[]]}
                   {:id 592
                    :template "More details on this topic can be found in [Ref]."
                    :choices [[]]}]}})
