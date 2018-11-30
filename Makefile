NAME	=		CurrencyConverter.jar

GRADLE=		gradle -i

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
