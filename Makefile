SRC		=		src/CurrencyConverter/Button.java \
					src/CurrencyConverter/Converter.java \
					src/CurrencyConverter/Currency.java \
					src/CurrencyConverter/Example.java \
					src/CurrencyConverter/Parser.java \
					src/CurrencyConverter/Window.java

CLASS	=		$(SRC:.java=.class)

NAME	=		CurrencyConverter.jar

GRADLE=		gradle

JC		=		javac
JFLAGS +=	-Xlint

RM		=		rm -f

all		:		$(NAME)

$(NAME):
					$(GRADLE) jar

package:
					$(GRADLE) assemble

build	:
					$(GRADLE) build

run		:
					$(GRADLE) run

test	:
					$(GRADLE) test

deps	:
					$(GRADLE) dependencies

clean	:
					$(GRADLE) clean

fclean:		clean
					$(RM) $(NAME)

re		:		clean all

.PHONY : all package build run test deps clean re
