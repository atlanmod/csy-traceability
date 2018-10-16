// Copyright (C) 2018 Clearsy
//
// This file is part of MockPilot.
//
// MockPilot is free software; you can redistribute it and/or modify it
// under the terms of the GNU General Public License as published by
// the Free Software Foundation; either version 3 of the License, or
// (at your option) any later version.
//
// MockPilot is distributed in the hope that it will be useful, but WITHOUT
// ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
// or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public
// License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.

MACHINE
    Train

SETS
    PAR_RESULT = { IN_PAR, NOT_IN_PAR, INCONS_POSITION };
    SPEED_RESULT = { STOPPED, MOVING, INCONS_SPEED }

OPERATIONS
     in_par <-- is_train_in_par =
     BEGIN
         in_par :: PAR_RESULT
     END
     ;
     stopped <-- is_train_stopped =
     BEGIN
         stopped :: SPEED_RESULT
     END

END
